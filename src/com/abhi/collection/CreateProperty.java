package com.abhi.collection;

import java.io.FileWriter;
import java.util.Properties;

public class CreateProperty {

	public static void main(String[] args) throws Exception{
		Properties p = new Properties();
		p.setProperty("Name", "Abhishek");
		p.setProperty("Age", "23");
		
		p.store(new FileWriter("info.properties"), "My info");
		

	}

}
