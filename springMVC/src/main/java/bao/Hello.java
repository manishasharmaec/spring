package bao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {

	 @RequestMapping("/abc")
	 public String abc()
	 {
	        return "hello";
	 }
	
	
	@RequestMapping("/add")
	public String add() {
		return "add";
	}
	
	
	 @RequestMapping("/addlogic")
	    public ModelAndView addlogic(HttpServletRequest request,HttpServletResponse response)
	    {
	        int a = Integer.parseInt(request.getParameter("txtnum1"));
	        int b = Integer.parseInt(request.getParameter("txtnum2"));
	        int c = a+b;
	        return new ModelAndView("add","res","result is "+c);
	    }
}
