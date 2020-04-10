package com.example.service;

import java.util.List;

import com.example.dao.ImageDao;
import com.example.dao.ImageDaoImpl;
import com.example.model.image;

public class ImageServiceImpl implements ImageService {

	private ImageDao img;
	{
		img=new ImageDaoImpl();
	}
	public void createRecord(String imageId, String imageUrl, boolean isAvailable) 
	{
		// TODO Auto-generated method stub
		img.createRecord(imageId, imageUrl, isAvailable);
		
	}

	public List<image> DisplayAll() {
		// TODO Auto-generated method stub
		return img.DisplayAll();
	}

	public image getImageByImageId(String imageId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(String imageId, String imageUr, boolean isAvailable) {
		// TODO Auto-generated method stub
		
	}

	public void delete(String imageId) {
		// TODO Auto-generated method stub
		
	}

}
