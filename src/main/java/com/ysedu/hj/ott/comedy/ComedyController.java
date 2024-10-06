package com.ysedu.hj.ott.comedy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String getComedyDetail(@PathVariable("id") Integer id, Model model) {
		Genre genre = comedyService.getComedy(id);
		model.addAttribute("genre", genre); // 상세 정보 모델에 추가 
		model.addAttribute("title", "상세페이지");
		return "comedyDetail";
	}
	
	@GetMapping
	public String getComedyList() {
		return "comedyList";
	}
	
	@GetMapping("/api")
	@ResponseBody
	public List<Genre> getComedyLists() {
		return comedyService.getComedyList();
	}
}
