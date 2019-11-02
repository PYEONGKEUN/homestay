package com.homestay.korea.service;

import java.util.HashMap;
import java.util.List;

import com.homestay.korea.DTO.PlaceDTO;

public interface IPlaceReadService {
	
	public PlaceDTO getPlace(String contentid);
	public List<PlaceDTO> getPlaceByThemeWithLimitDesc(String theme, int limit);
	
}
