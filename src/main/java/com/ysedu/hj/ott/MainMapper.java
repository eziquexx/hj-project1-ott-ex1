package com.ysedu.hj.ott;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainMapper {
	void setMovieInfo(Genre movie);
	void deleteItemById(Integer id);
}
