package com.abhi.reflection;

import java.lang.reflect.Method;

public class TestPrivateMethodCall{  
	public static void main(String[] args)throws Exception{  

		Class<PrivateMethodCall> c = PrivateMethodCall.class;  
		Object o= c.newInstance();  
		Method m =c.getDeclaredMethod("printThis");  
		m.setAccessible(true);  
		m.invoke(o);  
	}  
}  
