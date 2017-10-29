<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="common/header.jsp"/>
	
	<section class="centeredPanel posts">
		<h2>Solar System Geek Forum</h2>
		<h4>
			<c:url var="input" value="/alienForumInput"/>
			<a href="${input}">Post a message</a>
		</h4>
		
		<c:forEach var="post" items="${posts}" varStatus="loop">
			<div class="post">
				<p><b>${post.subject}</b><br>
				by ${post.username} on ${post.datePosted}</p>
				<p>${post.message}</p>
			</div>
		</c:forEach>
	</section>
	
<c:import url="common/footer.jsp"/>