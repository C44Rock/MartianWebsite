<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="common/header.jsp"/>
	
	<section class="centeredPanel">
	
		<h2>New Geek Post</h2>
		
		<form action="alienForumInput" method="POST">
			<label for="username">Username</label>
			<input type="text" name="username"/><br>
			<label for="subject">Subject</label>
			<input type="text" name="subject"/><br>
			<label for="message">Message</label>
			<input type="text" name="message"/><br>
			<input type="submit"/>
		</form>
	</section>
	
<c:import url="common/footer.jsp"/>