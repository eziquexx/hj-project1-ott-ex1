package com.ysedu.hj.ott.comedy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ysedu.hj.ott.Genre;

@Controller
@RequestMapping("/comedy")
public class ComedyController {
	@Autowired
	private ComedyService comedyService;
	
	@GetMapping("/{id}")
	@ResponseBody
	public Genre getComedy(@PathVariable("id") Integer id) {
		return comedyService.getComedy(id);
	}
	
	@GetMapping
	public String getComedy() {
		return "comedyList";
	}
	
	@GetMapping("/api")
	@ResponseBody
	public List<Genre> getComedyList() {
		return comedyService.getComedyList();
	}
}
