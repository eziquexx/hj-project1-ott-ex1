package com.ysedu.hj.ott.comedy;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ysedu.hj.ott.Genre;

@Mapper
public interface ComedyMapper {
	Genre getComedyById(Integer id);
	List<Genre> getComedyList();
}
