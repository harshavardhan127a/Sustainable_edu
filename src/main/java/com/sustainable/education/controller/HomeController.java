package com.sustainable.education.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/rewards")
	public String reward()
	{
		return "rewards";
	}
	
	@GetMapping("/product")
	public String product()
	{
		return "product";
	}
	@GetMapping("/what")
    public String getSustainabilityPage() {
        return "what";  // This should match the file name 'what.html' in templates folder
    }
	
	@GetMapping("/video")
    public String getVideo() {
        return "video";  // This should match the file name 'what.html' in templates folder
    }
	
	@GetMapping("/why")
    public String getWhySustainabilityPage() {
        return "why";
	}
	@Controller
	public class ProfileController {

	    @GetMapping("/profile")
	    public String showProfile() {
	        return "profile";  // This will resolve to src/main/resources/templates/profile.html
	    }
	}
	
	@Controller
	public class QueryController {

	    @GetMapping("/queries")
	    public String showQueryPage() {
	        return "queries";  // This returns queries.html in the templates folder
	    }
	}
	@Controller
	public class TypesController {

	    @GetMapping("/resources")
	    public String getTypes() {
	        return "resources";  // "types" maps to types.html in the templates directory
	    }
	}
	
	
	

}
