<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="common/header.jsp"/>
	
	<section class="centeredPanel">
		<h2>Shopping Cart</h2>
		<table class="black">
			<tr>
				<th></th>
				<th style="color:black">Name</th>
				<th style="color:black">Price</th>
				<th style="color:black">Quantity</th>
				<th style="color:black">Total</th>
			</tr>
			<c:forEach var="item" items="${cart}">
				<tr>
					<c:url var="productImg" value="img/${item.product.imageName}"/>
					<td style="color:black"><img src="${productImg}"/></td>
					<td style="color:black">${item.product.name}</td>
					<td style="color:black">${item.product.price}</td>
					<td style="color:black">${item.quantity}</td>
					<td style="color:black">${item.totalPrice}</td>
				</tr>
			</c:forEach>		
		</table>
		<div class="right">
			Grand Total: ${grandTotal}
		</div>
		<div class="right">
			<c:url var="checkout" value="/shoppingCart"/>
			<form action="${checkout}" method="POST">
				<input type="submit" value="Checkout">
			</form>
		</div>
	</section>
	
<c:import url="common/footer.jsp"/>