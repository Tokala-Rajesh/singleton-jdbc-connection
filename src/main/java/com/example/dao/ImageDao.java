package com.example.dao;

import java.util.List;

import com.example.model.image;

public interface ImageDao 
{
	public void createRecord(String imageId, String imageUrl,boolean isAvailable);
//	public void createRecord(image img);
	public List<image> DisplayAll();
	public image getImageByImageId(String imageId);
	public void update(String imageId, String imageUr,boolean isAvailable);
	public void delete(String imageId);
	
	

}
