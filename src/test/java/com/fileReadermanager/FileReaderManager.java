package com.fileReadermanager;

import java.io.IOException;

import com.configuration.Configureader;

public class FileReaderManager {
	
	//create a constructor 
	
	private FileReaderManager() {

	}
	
	// create a method for getting FileReader
	
	public static FileReaderManager getFileReader() throws IOException {
		// create a object for FileReaderManager inside the method to secure the constructor
		FileReaderManager frm = new FileReaderManager();
		frm.getConfigureader();
		return frm;
	}
	// create method for getting configureader
	
	public Configureader getConfigureader() throws IOException {
		//create a object for Configureader to call the methods 
		Configureader cfr = new Configureader();
		return cfr;
		
	}
	
	
	

}
