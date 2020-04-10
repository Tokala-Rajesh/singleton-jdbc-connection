package com.example.service;

import java.util.List;

import com.example.model.image;

public interface ImageService
{
	public void createRecord(String imageId, String imageUrl,boolean isAvailable);
	public List<image> DisplayAll();
	public image getImageByImageId(String imageId);
	public void update(String imageId, String imageUr,boolean isAvailable);
	public void delete(String imageId);
	


}
