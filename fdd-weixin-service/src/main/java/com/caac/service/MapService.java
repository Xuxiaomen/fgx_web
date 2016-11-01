package com.caac.service;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.caac.dao.MapMapper;
import com.caac.vo.CityVo;
import com.caac.vo.MapPointStringVo;
import com.caac.vo.MapPointVo;


@Service
public class MapService {
	
	@Resource
	private MapMapper mapDao;
	
	public List<MapPointVo> pointAll(HttpServletRequest request){
		List<MapPointVo> mapPoints = mapDao.getAllPoints();
		return mapPoints;
	}
	
	public List<MapPointStringVo> getProjectsInCity(CityVo vo, HttpServletRequest request){
		List<MapPointStringVo> mapPoints = mapDao.getProjectsInCity(vo.getCity());
		return mapPoints;
	}
}