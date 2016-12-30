package com.abhi.string;

public class RemoveDup {
	
	public static String removeDuplicate(String s) {
	    StringBuilder builder = new StringBuilder();
	    char lastchar = '\0';
	    int length;
	    for (int i = 0; i < s.length(); i++) {
	        String str = builder.toString();
	        length = builder.length();
	        
	        if (!str.equals("") && (str.charAt(str.length() - 1) == s.charAt(i))) {
	        	if(length > 2)
	        		builder.deleteCharAt(str.length() - 1);
	        	builder.append(s.charAt(i));
	        } else if (s.charAt(i) != lastchar)
	            builder.append(s.charAt(i));
	        
	        lastchar = s.charAt(i);
	    }
	    return builder.toString();
	}
	
	public static void main(String[] args) {

		String a="aaabcccdeeddf";
		String res=removeDuplicate(a);
		System.out.println(res);

	}


}
