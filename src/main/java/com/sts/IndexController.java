package com.sts;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionActivationListener;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	
	/*
	 * @RequestMapping("/result") public String index(HttpServletRequest request) //
	 * HttpServletRequest is used when we have n no. of fields i.e n .of keys hai (?data=20data1=10) 
	 { 
	 * // System.out.println("Value :"+request.getParameter("data")); // from client through we got the data
	 * HttpSession session = request.getSession(); // this two lines will hold the
	 * data and send to the client session.setAttribute("value",
	 * request.getParameter("data")); return "result"; 
	 }
	 */
	
	/*
	@RequestMapping("/result")
	public String index(@RequestParam("val") String data, HttpSession session) {
		
	//	System.out.println("data :"+ data);
		session.setAttribute("value", data);
		
		return "result";
	}
	*/
	
	/*
	@RequestMapping("/result")
	public String index(@RequestParam("val") String data, Model model) {
		
		model.addAttribute("value", data);
		return "result";
	}
	*/

	
	@RequestMapping("/result")
	public ModelAndView index(@RequestParam("val") String data) {
		/*
		 * Map<String, String> map = new HashMap<String, String>(); map.put("value",
		 * data);
		 */
		ModelAndView mv = new ModelAndView();
		mv.addObject("value", data);
		return mv;
		
		}
	
	
}
