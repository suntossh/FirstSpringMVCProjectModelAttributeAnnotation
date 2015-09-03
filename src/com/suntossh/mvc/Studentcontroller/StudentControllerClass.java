package com.suntossh.mvc.Studentcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentControllerClass{

	@ModelAttribute
	protected void bindingCommonInfoViaModelAttribute(Model model){
		model.addAttribute("headString", "Welcome to USA Santos");
	}
	
	@RequestMapping(value="/showLoginPage.html", method=RequestMethod.GET)
	protected ModelAndView showStudentLoginForm() {
		System.out.println("showStudentLoginForm");
		ModelAndView modelAndView = new ModelAndView("StudentLoginPage");
		modelAndView.addObject("messageString", "Welcome to Newyork princeston college, please fill form");
		return modelAndView;
	}


	
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	protected ModelAndView processStudentAdmissionForm(@ModelAttribute(value="studentI") Student student) {
		System.out.println("@RequestParam MAP ....");
		String nameStr = student.getStudentName();
		String hobbyStr = student.getStudentHobby();
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("msg", "Welcome to Newyork princeston college "+nameStr+ " Your hobby is "+hobbyStr);
		return modelAndView;
	}

	
}
