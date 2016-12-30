package com.abhi.io;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SerializationEx1 implements Serializable{
	
	String name;
	transient int age;
	
	public SerializationEx1(int age, String name) {
		this.name=name;
		this.age=age;
	}
}
