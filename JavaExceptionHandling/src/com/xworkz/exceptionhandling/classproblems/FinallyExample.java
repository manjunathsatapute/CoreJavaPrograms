package com.xworkz.exceptionhandling.classproblems;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FinallyExample {

	public static void main(String[] args) throws IOException{

		System.out.println("Begin prog");
		
		File file;
		FileInputStream in = null;
		
		try {
			file = new File("C://project/test.txt");
			in = new FileInputStream(file);
			String str = null;
			str.length();
			
		}catch (Exception e) {
			System.out.println("Exception has occured");
		}finally {
			System.out.println("Must execute statements");
			in.close();
		}
		
		System.out.println("End prog");
	}

}
