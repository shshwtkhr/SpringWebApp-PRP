package com.wipro.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Web app control flow sequence ------> index.jsp -> Dispatcher servlet -> MyController -> Welcome.jsp 

@Controller //- used to make class as a controller
public class MyController {

	//maps http requests to handler methods
	@RequestMapping("Welcome")
	public ModelAndView sayWelcome() {
		ModelAndView mv = new ModelAndView("Welcome");
		return mv;
	}
}
