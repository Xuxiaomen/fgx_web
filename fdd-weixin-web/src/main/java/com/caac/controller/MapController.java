package com.caac.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caac.service.MapService;
import com.caac.vo.CityVo;
import com.caac.vo.MapPointStringVo;
import com.caac.vo.MapPointVo;


@Controller
@RequestMapping("/map")
public class MapController {

	
	@Resource
	private MapService mapService;
	
	@RequestMapping(value = "/pointall", method = RequestMethod.POST)
	@ResponseBody
	public List<MapPointVo> pointAll(HttpServletRequest request) {
		return mapService.pointAll(request);
	}
	
	@RequestMapping(value = "/city", method = RequestMethod.POST)
	@ResponseBody
	public List<MapPointStringVo> getProjectsInCity(CityVo vo, HttpServletRequest request) {
		return mapService.getProjectsInCity(vo, request);
	}
}
