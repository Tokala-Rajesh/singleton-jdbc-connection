package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.image;
import com.example.factory.*;

public class ImageDaoImpl implements ImageDao
{
	MyConnectionFactory factory=MyConnectionFactory.getConnectionObject();
	List<image> list=new ArrayList<image>();
	

	public void createRecord(String imageId, String imageUrl, boolean isAvailable)
	{
		try {
			Connection connect=factory.getMyConnection();	
		
		PreparedStatement psInsert=connect.prepareStatement("insert into image value(?,?,?)");
		psInsert.setString(1, imageId);
		psInsert.setString(2, imageUrl);
		psInsert.setBoolean(3, isAvailable);
		psInsert.executeUpdate();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public List<image> DisplayAll() {
		ResultSet rs;
		try {
			Connection connect=factory.getMyConnection();	
		
		PreparedStatement psDisplay=connect.prepareStatement("select * from image");
		rs=psDisplay.executeQuery();
		while(rs.next())
		{
			String imageId=rs.getString(1);
			String imageUrl=rs.getString(2);
			boolean isAvailable=rs.getBoolean(3);
			image img=new image(imageId,imageUrl,isAvailable);
			list.add(img);
			
		}
		System.out.println(list);
		
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return list;
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
