package com.configuration;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class Configureader {
	
	//create a constructor to call the method
	//create a object for a properties
	 public  Properties p;
	public  Configureader() throws IOException {
		
		 File f = new File("./configure.properties");
		 
		 FileInputStream fis = new FileInputStream(f);
		 
		  p= new Properties();
		  
	// loading the file data into Properties method because getProperty starting stage is empty 	  
		  p.load(fis);
	 
		 
	}
	
	public  String getUrl() {
		String property = p.getProperty("url");
		return property;
		
	}
	public String getUserName() {
		String property = p.getProperty("username");
		return property;
	}
	
	public String getEmail() {
		String property = p.getProperty("email");
		return property;
	}
	public String getPhone() {
		String property = p.getProperty("phone");
		return property;
	}
	
	
}

