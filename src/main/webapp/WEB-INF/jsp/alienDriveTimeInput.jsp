<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="common/header.jsp"/>
	
	<section class="centeredPanel">
	
		<h2>Alien Travel Calculator</h2>
		
		<div>
			<c:url var="formInput" value="/alienDriveTimeOutput"/>
			<form action="${formInput}" method="GET">
				<label for="planet">Choose a planet:</label>
				<select name="planet">
					<option value="Mercury">Mercury</option>
					<option value="Venus">Venus</option>
					<option value="Mars">Mars</option>
					<option value="Jupiter">Jupiter</option>
					<option value="Saturn">Saturn</option>
					<option value="Uranus">Uranus</option>
					<option value="Neptune">Neptune</option>
				</select><br>
				
				<label for="planet">Choose a method of transport:</label>
				<select name="transport">
					<option value="Walking">Walking</option>
					<option value="Car">Car</option>
					<option value="Bullet Train">Bullet Train</option>
					<option value="Boeing 747">Boeing 747</option>
					<option value="Concorde">Concorde</option>
				</select><br>
				
				<label for="earthage">Enter your Earth age:</label>
				<input type="text" name="earthage"/><br><br>
				
				<input type="submit" name="Calculate Travel Time"/>
			</form>
		</div>
	</section>
	
<c:import url="common/footer.jsp"/>