package com.abhi.collection;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ReadProperty {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception{
		FileReader f1=new FileReader("info.properties");
		
		Properties p1=new Properties();
		p1.load(f1);
		
		System.out.println(p1.getProperty("Name"));
		System.out.println(p1.getProperty("Age"));
		
		Properties p=System.getProperties();  
		Set<?> set=p.entrySet();  
		  
		Iterator<?> itr=set.iterator();  
		while(itr.hasNext()){  
		Map.Entry entry=(Map.Entry)itr.next();  
		System.out.println(entry.getKey()+" = "+entry.getValue());  
		}  

	}

}
