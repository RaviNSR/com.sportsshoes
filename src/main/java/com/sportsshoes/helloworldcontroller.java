package com.sportsshoes;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sportsshoes.User.User;
import com.sportsshoes.User.UserService;

@Controller
public class helloworldcontroller {
	@Autowired
	UserService us;
	
	@RequestMapping("/")
	public String home()
	{
		User b = new User();
		
		b.setUID(1);
		b.setActive(true);
		b.setEMAIL("abcd@efg.com");
		b.setFIRST_NAME("a");
		b.setLAST_NAME("b");
		b.setPASSWORD("abc@12345");
		b.setCONFIRMATION_PASSWORD("abc@12345");
		b.setMOBILE_NUMBER("986");
		
		us.insert(b);
		
		return "index";
	}
	
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/head")
	public String head()
	{
		return "head";
	}
	
	@RequestMapping("/footer")
	public String footer()
	{
		return "footer";
	}
	
	@RequestMapping("/head-meta")
	public String head_meta()
	{
		return "head-meta";
	}
	
	@RequestMapping("/aboutus")
	public String aboutus()
	{
		return "aboutus";
	}
	
	@RequestMapping("/contactus")
	public String contactus()
	{
		return "contactus";
	}
	
	@RequestMapping("/Product")
	public String Product()
	{
		return "product";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/register")
	public ModelAndView register (@Valid @ModelAttribute("User") User i)
	{
		
		ModelAndView mav  = new ModelAndView("register");
		mav.addObject("User", new User());
		return mav;
	}
	@RequestMapping(value="/ADDUser",method =RequestMethod.POST)
	public ModelAndView ADDUser(@Valid @ModelAttribute("User")  User i,BindingResult bind)
	{
		ModelAndView mav = new ModelAndView("register");
		System.out.println(i.getLAST_NAME());
		System.out.println(i.getFIRST_NAME());
		mav.addObject("User", i);
		us.insert(i);

					return mav;
		}


	
    }
