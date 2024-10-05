package com.ysedu.hj.ott.comedy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysedu.hj.ott.Genre;

@Service
public class ComedyService {
	@Autowired
	private ComedyMapper comedyMapper;
	
	public Genre getComedy(Integer id) {
		return comedyMapper.getComedyById(id);
	}
	
	public List<Genre> getComedyList() {
		return comedyMapper.getComedyList();
	}
}
