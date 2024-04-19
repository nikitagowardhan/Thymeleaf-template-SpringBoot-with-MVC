
package asteric.in.Day2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import asteric.in.Day2.model.User;


	@Controller
	public class HomeController {

		
		

		@RequestMapping("/test1")
		String myfun(Model m)
		{
			
			User u = new User();
			m.addAttribute("obj", u);
			System.out.println("Before Form Data "+u);
			
			return "reg.html";
		}
		
		@RequestMapping("/registeruser")
		ModelAndView myfun1(@ModelAttribute("obj") User u1)
		{
			
			
			System.out.println("After Form User Object Data "+u1);
			ModelAndView mv = new ModelAndView("show.html");
			mv.addObject("o", u1);
			return mv;
		}
		
		
		
		
}
