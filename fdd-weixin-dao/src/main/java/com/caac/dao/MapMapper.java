package com.caac.dao;


import java.util.List;

import org.springframework.stereotype.Component;

import com.caac.vo.MapPointStringVo;
import com.caac.vo.MapPointVo;


@Component
public interface MapMapper {
	
	//获取所有的点坐标
	public List<MapPointVo> getAllPoints();

	public List<MapPointStringVo> getProjectsInCity(String city);
}
