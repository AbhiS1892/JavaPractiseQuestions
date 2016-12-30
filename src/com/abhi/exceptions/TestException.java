package com.abhi.exceptions;

public class TestException{
	
	public void printFile() {
//		throw new UncheckedException("ki");
		try {
			throw new CheckedException("ki");
		} catch (CheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TestException u = new TestException();
//		try {
//			u.printFile();
//		} catch (MyException e) {
//			System.out.println(e);
//		}
		u.printFile();
	}
}