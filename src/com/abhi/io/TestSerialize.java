package com.abhi.io;

import java.io.*;

public class TestSerialize {

	public static void main(String[] args) throws Exception {
		SerializationEx1 s1=new SerializationEx1(22, "Abhi");

		FileOutputStream fout=new FileOutputStream("f.txt");  
		ObjectOutputStream out=new ObjectOutputStream(fout);  

		out.writeObject(s1);  
		out.flush(); 
		out.close();
		fout.close();
		System.out.println("Success"); 

	}

}
