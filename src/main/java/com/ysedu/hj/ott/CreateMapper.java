package com.ysedu.hj.ott;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CreateMapper {
	void setMovieInfo(Genre movie);
}
