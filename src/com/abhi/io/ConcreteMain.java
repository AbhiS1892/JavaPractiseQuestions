package com.abhi.io;

import java.io.*;


public class ConcreteMain {
	public static void main(String... args) throws Exception, IOException{

		File f= new File("ext.txt");
		User u= new User("Atul",20);

		@SuppressWarnings("resource")
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));  
		out.writeObject(u);  

		@SuppressWarnings("resource")
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		u=(User)in.readObject();

		System.out.println("After  de externalizing user name: " +u.getUserName()+" and age is:"+u.getAge());   
	}
}