package com.example.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class image 
{
	
	private String imageId;
	private String imageUrl;
	private boolean isAvailable;
	
	public image(String imageId, String imageUrl,boolean isAvailable)
	{
		this.imageId=imageId;
		this.imageUrl=imageUrl;
		this.isAvailable=isAvailable;
		
	}

	@Override
	public String toString() {
		return "image [imageId=" + imageId + ", imageUrl=" + imageUrl + ", isAvailable=" + isAvailable + "]";
	}
	


}
