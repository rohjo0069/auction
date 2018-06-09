package com.study.auction.controller.admin;

import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.auction.service.admin.AdminService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/adminMenu")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Autowired
    AdminService adminService;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin(Locale locale, Model model, @RequestParam HashMap<String, Object> param) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		adminService.getList(param);
		
		
		return "admin/admin";
	}
	
}
