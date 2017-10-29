<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="common/header.jsp"/>
	
	<section class="centeredPanel">
	
		<h2>Space Geek Trivia</h2>
		
		<div>
			<c:url var="formAction" value="/spaceTrivia"/>
			<form action="${formAction}" method="POST">
				<label for="username">Enter your name: </label>
				<input type="text" name="username"/><br><br>
				
				<label for="moonwalker">Who first walked on the moon?</label><br>
				<input type="radio" name="moonwalker" value="Tom Hanks"/>Tom Hanks<br>
				<input type="radio" name="moonwalker" value="Jim Lovell"/>Jim Lovell<br>
				<input type="radio" name="moonwalker" value="Neil Armstrong"/>Neil Armstrong<br>
				
				<input type="submit"/>
			</form>
		</div>
	</section>
	
<c:import url="common/footer.jsp"/>