package com.telusuko;

@Controller
public class HelloController {
	@RequestMapping
	public ModelAndView helloWorld()
	{
		String message =" Hello Mvc";
		return new ModelAndView(" hellopage","message", message);
		
	}
	

}
