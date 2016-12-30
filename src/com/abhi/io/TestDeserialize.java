package com.abhi.io;

import java.io.*;

public class TestDeserialize {

	public static void main(String[] args) throws Exception{
		ObjectInputStream o1=new ObjectInputStream(new FileInputStream("f.txt"));
		SerializationEx1 s1=(SerializationEx1)o1.readObject();
		System.out.println(s1.age+" "+s1.name);
		o1.close();

	}

}
