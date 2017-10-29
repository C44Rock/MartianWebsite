<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="common/header.jsp"/>
	
	<section class="centeredPanel">
		<div class="img-div">
			<c:url var="planetImg" value="img/${param.planet.toLowerCase()}.jpg"/>
			<img src="${planetImg}"/>
		</div>
		<div class="text-div">
			If you are traveling by <b>${param.transport}</b>, you will reach <b>${param.planet} in ${travelTime}</b> years.
			You will be <b>${planetAge}</b> years old.
		</div>
	</section>

<c:import url="common/footer.jsp"/>