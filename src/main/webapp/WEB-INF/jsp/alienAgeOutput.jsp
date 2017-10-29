<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="common/header.jsp"/>
	
	<section class="centeredPanel">
		<div class="img-div">
			<c:url var="planetImg" value="img/${param.planet.toLowerCase()}.jpg"/>
			<img src="${planetImg}"/>
		</div>
		<div class="text-div">
			If you are <b>${param.earthage}</b> years old on planet Earth, 
			then you are <b>${planetAge} ${param.planet}</b> years old.
		</div>
	</section>

<c:import url="common/footer.jsp"/>