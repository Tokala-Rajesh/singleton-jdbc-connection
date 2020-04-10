package com.example.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.factory.MyConnectionFactory;

import com.example.model.image;
import com.example.service.ImageService;
import com.example.service.ImageServiceImpl;


/**
 * Hello world!
 *
 */
public class App 
{
	private ImageService service;
	private static Scanner scanner = new Scanner(System.in);

	{
		service = new ImageServiceImpl();
	}
	
    public static void main( String[] args )
    {
    	App app=new App();
    	int choice = 0;
    	do
    	{
    		System.out.println("1.Create a Record");
    		System.out.println("2.Display all");
    		System.out.println("3.Get image by id");
    		System.out.println("4.update");
    		System.out.println("5.delete");
    		choice=scanner.nextInt();
    		switch(choice)
    		{
    		case 1:
    			System.out.println("enter the image id");    	
    	     	String imageId=scanner.next();    	
    	    	System.out.println("enter the image url");
    	     	String imageUrl=scanner.next();
    	    	System.out.println("enter whethere image is available or not");
    	    	boolean isAvailable=scanner.nextBoolean();
    	    	app.service.createRecord(imageId,imageUrl,isAvailable);
    	    	break;
    		case 2:
    			app.service.DisplayAll();
	
    			break;
    		case 3:
    			break;
    		case 4:
    			break;
    		case 5:
    			break;
    		}
    		
    	}while(choice!=0);
    	
     	
    	//app.service.createRecord(new image(scanner.next(),scanner.next(),scanner.nextBoolean()));
    	
    	
//    	MyConnectionFactory factory,factory1=null;
//    	factory=MyConnectionFactory.getConnectionObject();
//    	factory1=MyConnectionFactory.getConnectionObject();
//    	System.out.println(factory==factory1);
//    	try {
//			Connection connection=factory.getMyConnection();
//			System.out.println(connection);
//			Connection connection1=factory.getMyConnection();
//			System.out.println(connection1);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    	
    	
    }
}
