package com.techelevator.ssg.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.ssg.model.store.DollarAmount;
import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;
import com.techelevator.ssg.model.store.ProductInCart;

@SessionAttributes({ "cart", "grandTotal" })
@Controller
public class StoreController {

	@Autowired
	private ProductDao productDao;
	
	@RequestMapping(path="/spaceStore", method=RequestMethod.GET)
	public String displayStore(HttpServletRequest request) {
		List<Product> products = productDao.getAllProducts();
		request.setAttribute("products", products); 
		
		return "spaceStore";
	}
	
	@RequestMapping(path="/productDetail", method=RequestMethod.GET)
	public String displayProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
			String idParam = request.getParameter("id");
			long productId = Long.parseLong(idParam);
			request.setAttribute("product", productDao.getProductById(productId));
			
			return "productDetail";
	} 
	
	@RequestMapping(path="/productDetail", method=RequestMethod.POST)
	public String addProductToCart(@RequestParam("id") Long productId, 
									@RequestParam("quantity") int quantity, 
									ModelMap model) {
		Product product = productDao.getProductById(productId);
		ProductInCart productInCart = new ProductInCart();
		productInCart.setProduct(product);
		productInCart.setQuantity(quantity);
		List<ProductInCart> cart = (List<ProductInCart>)model.get("cart");
		if(cart == null) {
			cart = new ArrayList<ProductInCart>();
			model.addAttribute("cart", cart);
		}
		cart.add(productInCart);
		DollarAmount grandTotal = new DollarAmount(0);
		for (ProductInCart item : cart) {
			grandTotal = grandTotal.plus(item.getTotalPrice());
		}
		model.addAttribute("grandTotal", grandTotal);
		
		return "redirect:/shoppingCart";
	}
	
	@RequestMapping(path="/shoppingCart", method=RequestMethod.GET)
	public String displayShoppingCart(HttpServletRequest request) {
			
		return "shoppingCart";
	} 
	
	@RequestMapping(path="/shoppingCart", method=RequestMethod.POST)
	public String checkout(ModelMap model) {
		List<ProductInCart> cart = new ArrayList<ProductInCart>();
		model.addAttribute("cart", cart);
			
		return "redirect:/spaceStore";
	} 

}
