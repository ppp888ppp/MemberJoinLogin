package com.nyu.MemberJoin;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	
	@ModelAttribute("cp")// using the name in 'home.jsp' 
	public String getContextPath(HttpServletRequest request) {
		return request.getContextPath(); // WEB-INF/views
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "/index";
	}
}
