package com.sportsshoes;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.validation.Valid;
import javax.servlet.ServletContext;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sportsshoes.Product.ProductService;
import com.sportsshoes.User.User;
import com.sportsshoes.Product.Product;
import com.sportsshoes.User.UserService;


@Controller
public class helloworldcontroller {
	@Autowired
	UserService us;
	@Autowired
	ProductService ps;
	
	@Autowired
	ServletContext context;
	
	@RequestMapping("/index")
	public String home()
	{	
		return "index";
	}
	
	@RequestMapping("/")
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


	

	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/addproduct")
	public String addproduct()
	{
		return "addproduct";
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

	@RequestMapping(value ="/AddProduct", method = RequestMethod.POST)
	public ModelAndView ADDProduct(@Valid @ModelAttribute("Product") Product P,BindingResult bind)
{	
	ModelAndView mav = new ModelAndView("addproduct");
	System.out.println(P.getProductName());
	
	ps.insert(P);
	return mav;
}

@RequestMapping(value = "/AddProductToDB", method = RequestMethod.POST)
public ModelAndView AddProductToDB(@ModelAttribute("adminpage") Product p, BindingResult bind) {
	ModelAndView mav = new ModelAndView("adminpage");
	ps.insert(p);
	
	Product pi = ps.getProductWithMaxId();
	
	//
	
	try
	{
		String path = context.getRealPath("/");
        
        System.out.println(path);
        
        File directory = null;
        
        if (p.getProductFile().getContentType().contains("image"))
        {
        	directory = new File(path + "/resources/images");
        	
        	System.out.println(directory);
        	
        	byte[] bytes = null;
            File file = null;
            bytes = p.getProductFile().getBytes();
            
            if (!directory.exists()) directory.mkdirs();
            
            file = new File(directory.getAbsolutePath() + System.getProperty("file.separator") + "image_" + pi.getProductId() + ".jpg");
            
            System.out.println(file.getAbsolutePath());
            
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file));
            stream.write(bytes);
            stream.close();
            
            pi.setProductImage("resources/images/image_" + pi.getProductId() + ".jpg");
            
            ps.update(pi);
        }
	}
	catch( Exception e )
	{
		e.printStackTrace();
	}
	
	//
	
	List<Product> list = ps.getAllProducts();
	
	JSONArray jarr = new JSONArray();
	
	for( Product p1 : list )
	{
		JSONObject jobj = new JSONObject();
		
		jobj.put("ProductId", p1.getProductId());
		jobj.put("ProductName", p1.getProductName());
		jobj.put("ProductDescription", p1.getProductDescription());
		jobj.put("ProductCateogry", p1.getProductCateogry());
		jobj.put("ProductPrice", p1.getProductPrice());
		jobj.put("ProductQuantity", p1.getProductQuantity());
		jobj.put("ProductImage", p1.getProductImage());
		
		
		jarr.add(jobj);
	}
	
	System.out.println(jarr.toJSONString());
	
	mav.addObject("JSONData", jarr.toJSONString());
	

	return mav;
}

@RequestMapping("/viewproduct/{ProductId}")
public ModelAndView viewproduct(@PathVariable("ProductId") int pid) {
	ModelAndView mav = new ModelAndView("viewproduct");
	
	Product p = ps.getProduct(pid);
	
	if( p!=null )
	{
		mav.addObject("ProductId",p.getProductId());
		mav.addObject("ProductName",p.getProductName());
		mav.addObject("ProductCateogry",p.getProductCateogry());
		mav.addObject("ProductPrice",p.getProductPrice());
		mav.addObject("ProductQuantity",p.getProductQuantity());
		mav.addObject("ProductImage",p.getProductImage());
		mav.addObject("ProductDescription",p.getProductDescription());
		
	}
	return mav;
}

@RequestMapping("/deleteproduct/{ProductId}")
public ModelAndView deleteproduct(@PathVariable("ProductId") int pid) {
	ModelAndView mav = new ModelAndView("adminpage");
	
	ps.delete(pid);
	
	List<Product> list = ps.getAllProducts();
	
	JSONArray jarr = new JSONArray();
	
	for( Product p1 : list )
	{
		JSONObject jobj = new JSONObject();
		
		jobj.put("ProductId", p1.getProductId());
		jobj.put("ProductName", p1.getProductName());
		jobj.put("ProductDescription", p1.getProductDescription());
		jobj.put("ProductCateogry", p1.getProductCateogry());
		jobj.put("ProductPrice", p1.getProductPrice());
		jobj.put("ProductQuantity", p1.getProductQuantity());
		
		jobj.put("ProductImage", p1.getProductImage());
		
		
		jarr.add(jobj);
	}
	
	System.out.println(jarr.toJSONString());
	
	mav.addObject("JSONData", jarr.toJSONString());
			
	return mav;
}

@RequestMapping("/updateproduct/{ProductId}")
public ModelAndView updateproduct(@PathVariable("ProductId") int pid) {
	ModelAndView mav = new ModelAndView("updateproduct");
	
	Product p = ps.getProduct(pid);
	mav.addObject("ProductId", p.getProductId());
	mav.addObject("Product", p);
	return mav;
}


@RequestMapping(value = "/UpdateProductToDB", method = RequestMethod.POST)
public ModelAndView UpdateProductToDB(@ModelAttribute("Product") Product p, BindingResult bind) {
	ModelAndView mav = new ModelAndView("adminpage");
	//ps.update(p);
	
//
	
	try
	{
		String path = context.getRealPath("/");
        
        System.out.println(path);
        
        File directory = null;
        
        if (p.getProductFile() != null)
        
        if (p.getProductFile().getContentType().contains("image"))
        {
        	directory = new File(path + "/resources/images");
        	
        	System.out.println(directory);
        	
        	byte[] bytes = null;
            File file = null;
            bytes = p.getProductFile().getBytes();
            
            if (!directory.exists()) directory.mkdirs();
            
            System.out.println(p.getProductId());
            file = new File(directory.getAbsolutePath() + System.getProperty("file.separator") + "image_" + p.getProductId() + ".jpg");
            
            System.out.println(file.getAbsolutePath());
            
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file));
            stream.write(bytes);
            stream.close();
            
            p.setProductImage("resources/images/image_" + p.getProductId() + ".jpg");
            
           // ps.update(pi);
        }
        else 
        {
        	p.setProductImage("resources/images/image_" + p.getProductId() + ".jpg");
        }
	}
	catch( Exception e )
	{
		e.printStackTrace();
	}
	
	//
	
	ps.update(p);
	
	List<Product> list = ps.getAllProducts();
	
	JSONArray jarr = new JSONArray();
	
	for( Product p1 : list )
	{
		JSONObject jobj = new JSONObject();
		
		jobj.put("ProductId", p1.getProductId());
		jobj.put("ProductName", p1.getProductName());
		jobj.put("ProductDescription", p1.getProductDescription());
		jobj.put("ProductCateogry", p1.getProductCateogry());
		jobj.put("ProductPrice", p1.getProductPrice());
		jobj.put("ProductQuantity", p1.getProductQuantity());
		jobj.put("ProductImage", p1.getProductImage());
		
		
		jarr.add(jobj);
	}
	
	System.out.println(jarr.toJSONString());
	
	mav.addObject("JSONData", jarr.toJSONString());
	

	return mav;
}

@RequestMapping(value ="/login", method = RequestMethod.POST)
public ModelAndView logincheck(@RequestParam("username")String a,@RequestParam("password") String b)
{	
	ModelAndView mav = new ModelAndView("login");
	ModelAndView mav1 = new ModelAndView("adminpage");
	
List<Product> list = ps.getAllProducts();
	
	JSONArray jarr = new JSONArray();
	
	for( Product p1 : list )
	{
		JSONObject jobj = new JSONObject();
		
		jobj.put("ProductId", p1.getProductId());
		jobj.put("ProductName", p1.getProductName());
		jobj.put("ProductDescription", p1.getProductDescription());
		jobj.put("ProductCateogry", p1.getProductCateogry());
		jobj.put("ProductPrice", p1.getProductPrice());
		jobj.put("ProductQuantity", p1.getProductQuantity());
		jobj.put("ProductImage", p1.getProductImage());
		
		
		jarr.add(jobj);
	}
	
	mav.addObject("JSONData", jarr.toJSONString());
	mav1.addObject("JSONData", jarr.toJSONString());
	
	if(a.equals("ravi") && b.equals("pass"))
	{
		return mav1;
	}
	else
		
	
	
	
	return mav;
}

//product page controller
@RequestMapping("/product")
public ModelAndView product() {
	ModelAndView mav = new ModelAndView("product");

	List<Product> list = ps.getAllProducts();
	
	JSONArray jarr = new JSONArray();
	
	for( Product p1 : list )
	{
		JSONObject jobj = new JSONObject();
		
		jobj.put("ProductId", p1.getProductId());
		jobj.put("ProductName", p1.getProductName());
		jobj.put("ProductDescription", p1.getProductDescription());
		jobj.put("ProductCategory", p1.getProductCateogry());
		jobj.put("ProductPrice", p1.getProductPrice());
		jobj.put("ProductQuantity", p1.getProductQuantity());
		jobj.put("ProductImage", p1.getProductImage());
		
		
		jarr.add(jobj);
	}
	
	System.out.println(jarr.toJSONString());
	
	mav.addObject("JSONData", jarr.toJSONString());
	
	return mav;

}


}
