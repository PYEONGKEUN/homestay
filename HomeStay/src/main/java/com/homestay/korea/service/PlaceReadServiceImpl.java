package com.homestay.korea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.homestay.korea.DAO.IPlaceDAO;

import com.homestay.korea.DTO.PlaceDTO;

@Service
public class PlaceReadServiceImpl implements IPlaceReadService {
	
	@Autowired
	private IPlaceDAO palceDAO;

	@Override
	public PlaceDTO getPlace(String contentid) {
		// TODO Auto-generated method stub
		PlaceDTO palce = palceDAO.readWithContentid(contentid);
		return palce;
	}

	@Override
	public ArrayList<PlaceDTO> getPlaceByThemeWithLimitDesc(String theme, int limit) {
		// TODO Auto-generated method stub
		ArrayList<PlaceDTO> resultList = palceDAO.readWithThemeLimitDesc(theme, limit);
				
		return resultList;
	}


	
	
	
	
}




















