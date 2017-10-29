<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="common/header.jsp"/>
	
	<section class="centeredPanel">
	
		<h2>Alien Age Calculator</h2>
		
		<div>
			<c:url var="formInput" value="/alienAgeOutput"/>
			<form action="${formInput}" method="GET">
				<label for="planet">Choose a planet: </label>
				<select name="planet">
					<option value="Mercury">Mercury</option>
					<option value="Venus">Venus</option>
					<option value="Mars">Mars</option>
					<option value="Jupiter">Jupiter</option>
					<option value="Saturn">Saturn</option>
					<option value="Uranus">Uranus</option>
					<option value="Neptune">Neptune</option>
				</select><br>
				
				<label for="earthage">Enter your Earth age: </label>
				<input type="text" name="earthage"/><br><br>
				
				<input type="submit" name="Calculate Age"/>
			</form>
		</div>
	</section>
	
<c:import url="common/footer.jsp"/>