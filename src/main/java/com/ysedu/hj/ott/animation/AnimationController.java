package com.ysedu.hj.ott.animation;

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
@RequestMapping("/animation")
public class AnimationController {
	@Autowired
	private AnimationService animationService;
	
	@GetMapping("/{id}")
	public String getAnimationDetail(@PathVariable("id") Integer id, Model model) {
		Genre genre = animationService.getAnimation(id);
		model.addAttribute("genre", genre);
		model.addAttribute("title", "상세페이지");
		return "animationDetail";
	}
	
	@GetMapping
	public String getAnimation() {
		return "animationList";
	}
	
	@GetMapping("/api")
	@ResponseBody
	public List<Genre> getAnimationList() {
		return animationService.getAnimationList();
	}
}
