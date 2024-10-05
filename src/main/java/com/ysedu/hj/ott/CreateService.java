package com.ysedu.hj.ott;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CreateService {
	@Autowired
	private CreateMapper createMapper;
	
	public void setMovieInfo(Genre movie) {
		createMapper.setMovieInfo(movie);
	}
	
}
