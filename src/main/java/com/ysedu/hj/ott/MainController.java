package com.ysedu.hj.ott;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/")
public class MainController {
	@Autowired
	private CreateService createService;
	
	@GetMapping
	public String getMain() {
		return "index";
	}
	
	@GetMapping("/create")
	public String getCreate() {
		return "create";
	}
	
	@PostMapping
	@ResponseBody
	public void createMovie(@RequestBody Genre moive) {
		createService.setMovieInfo(moive);
	}
	
	
}
