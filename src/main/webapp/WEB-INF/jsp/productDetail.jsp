<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="common/header.jsp"/>
	
	<section class="centeredPanel posts">
		<h2>Space Store - Product Details</h2>
		
		<div>
			<c:url var="productImg" value="img/${product.imageName}"/>
			<img src="${productImg}"/>
		</div>
		<div>
			<p><b>${product.name}</b></p>
			<p>${product.price}</p>
			<p>${product.description}</p>
			
			<p>
				<c:url var="formInput" value="/productDetail">
					<c:param name="id" value="${product.id}"/>
				</c:url>
				<form action="${formInput}" method="POST">
					<label for="quantity">Enter the quantity to buy: </label>
					<input type="text" name="quantity" id="quantity">
					<input type="submit" value="Add to Cart">
				</form>
			</p>
		</div>
	</section>
	
<c:import url="common/footer.jsp"/>