package com.techelevator.ssg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TriviaController {
	
	@RequestMapping(path="/spaceTrivia", method=RequestMethod.GET)
	public String displayTrivia(HttpServletRequest request) {
		return "spaceTrivia";
	}
	
	@RequestMapping(path="/spaceTrivia", method=RequestMethod.POST)
	public String processAnswer(@RequestParam String username,
								@RequestParam String moonwalker) {
		
		if (moonwalker.equals("Neil Armstrong")) {
			return "redirect:/correctAnswerPage";
		} else { 
			return "redirect:/incorrectAnswerPage";
		}
	}
	
	@RequestMapping(path="/correctAnswerPage", method=RequestMethod.GET)
	public String correctAnswer(HttpServletRequest request) {
		
		return "correctAnswerPage";
	}
	
	@RequestMapping(path="/incorrectAnswerPage", method=RequestMethod.GET)
	public String incorrectAnswer(HttpServletRequest request) {
		
		return "incorrectAnswerPage";
	}
	
}
