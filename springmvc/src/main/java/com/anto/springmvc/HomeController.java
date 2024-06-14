package com.anto.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anto.springmvc.dao.AlienDao;
import com.anto.springmvc.model.Alien;

// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpSession;



@Controller
public class HomeController 
{
	@Autowired
	private AlienDao dao;
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name", "Aliens");
	}
	
	@RequestMapping("/") //ketika kita mengakses home page("/") jalankan method dibawah
	public String home()
	{
		System.out.println("home page requested");
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1")int i, @RequestParam("num2") int j, ModelMap m)
	{	
		int num3 = i+j;
		m.addAttribute("num3", num3);
		
		return "result";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m)
	{
		m.addAttribute("result", dao.getAliens());
		return "showAliens";
	}
	
	@GetMapping("getAlien")
	public String getAlien(@RequestParam("aid") int aid, Model m)
	{
		m.addAttribute("result", dao.getAlien(aid));
		return "showAliens";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("result") Alien a)
	{
		dao.addAlien(a);
		return "showAliens";
	}
}
