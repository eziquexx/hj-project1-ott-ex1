package com.ysedu.hj.ott.animation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysedu.hj.ott.Genre;

@Service
public class AnimationService {
	@Autowired
	private AnimationMapper animationMapper;
	
	public Genre getAnimation(Integer id) {
		return animationMapper.getAnimationById(id);
	}
	
	public List<Genre> getAnimationList() {
		return animationMapper.getAnimationList();
	}

}
