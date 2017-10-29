<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="common/header.jsp"/>
	
	<section class="centeredPanel posts">
		<h2>Space Store</h2>
		
		<c:forEach var="product" items="${products}">
			<div class="list-div">
				<div class="img-div">
					<c:url var="productImg" value="img/${product.imageName}"/>
					<c:url var="detailLink" value="/productDetail">
						<c:param name="id" value="${product.id}"/>
					</c:url>
					<a href="${detailLink}"><img src="${productImg}"/></a>
				</div>
				
				<div class="info-div">
				<p><b>${product.name}</b></p>
				<p>${product.price}</p>
				</div>
			</div>
		</c:forEach>
	</section>
	
<c:import url="common/footer.jsp"/>