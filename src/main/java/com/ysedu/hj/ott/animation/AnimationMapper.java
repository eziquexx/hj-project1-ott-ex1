package com.ysedu.hj.ott.animation;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ysedu.hj.ott.Genre;

@Mapper
public interface AnimationMapper {
	Genre getAnimationById(Integer id);
}
