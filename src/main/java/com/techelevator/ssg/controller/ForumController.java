package com.techelevator.ssg.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.forum.ForumPost;
import com.techelevator.ssg.model.forum.JdbcForumDao;

@Controller
public class ForumController {
	
	private DataSource dataSource;
	
	@Autowired
	public ForumController(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@RequestMapping(path="/alienForum", method=RequestMethod.GET)
	public String displayForum(HttpServletRequest request) {
		JdbcForumDao dao = new JdbcForumDao(dataSource);
		List<ForumPost> posts = dao.getAllPosts();
		
		/*DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm");
		
		for (ForumPost post : posts) {
			LocalDateTime newDate = LocalDateTime.parse(post.getDatePosted().toString(), dateFormat);
			post.setDatePosted(newDate);
		}*/
		
		request.setAttribute("posts", posts);
		
		return "alienForum";
	}
	
	@RequestMapping(path="/alienForumInput", method=RequestMethod.GET)
	public String displayForumInput(HttpServletRequest request) {
		return "alienForumInput";
	}
	
	@RequestMapping(path="/alienForumInput", method=RequestMethod.POST)
	public String processForumPost(@RequestParam String username,
									@RequestParam String subject,
									@RequestParam String message) {
		JdbcForumDao dao = new JdbcForumDao(dataSource);
		
		ForumPost post = new ForumPost();
		post.setDatePosted(LocalDateTime.now());
		post.setUsername(username);
		post.setSubject(subject);
		post.setMessage(message);
		dao.save(post);
		 
		return "redirect:/alienForum";
	}
		
}