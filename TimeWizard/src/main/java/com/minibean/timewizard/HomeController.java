package com.minibean.timewizard;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/success")
	public String successPage() {
		return "success";
	}
	
	@RequestMapping(value="/invalidate")
	public String invalidate(HttpSession session) {
		if (session != null) {
			session.invalidate();
		}
		return "redirect:./";
	}
	
	@RequestMapping(value="/finalactionpage")
	public String finalactionpage() {
		return "finalactionpage";
	}
	
	@RequestMapping(value="/finalnotice")
	public String finalnotice() {
		return "finalnotice";
	}
	
	@RequestMapping(value="/finalnoticedetail")
	public String finalnoticedetail() {
		return "finalnoticedetail";
	}
	
	@RequestMapping(value="/finalstopwatch")
	public String finalstopwatch() {
		return "finalstopwatch";
	}
	
	@RequestMapping(value="/finaltimer")
	public String finaltimer() {
		return "finaltimer";
	}
	
	@RequestMapping(value="/mypage")
	public String mypage() {
		return "mypage";
	}
}