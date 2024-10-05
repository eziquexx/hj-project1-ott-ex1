package com.ysedu.hj.ott.animation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@GetMapping
	@ResponseBody
	public String getAnimation() {
		return "animation";
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Genre getAnimation(@PathVariable("id") Integer id) {
		return animationService.getAnimation(id);
	}
}
