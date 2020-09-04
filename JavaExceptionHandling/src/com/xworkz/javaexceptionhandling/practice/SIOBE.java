package com.xworkz.javaexceptionhandling.practice;

public class SIOBE {

	public static void main(String[] args) {

		try {
			// String[] strarr = new String[3];
			// String strarr[] = {"m", "a", "n"};

			String s = "Manjunath Satapute";

			System.out.println("Length of string: "+s.length());

			String str = s.substring(2);
			System.out.println("Gives sub-string from given index: "+str);

			String str1 = s.substring(2, 9);
			System.out.println("Gives sub-string with start & end index: "+str1);

			char c = s.charAt(1);
			System.out.println("charAt gives character at specifice index: "+c);

			CharSequence ch = s.subSequence(0, 19);
			System.out.println("Gives sub-sequence with start & end index: "+ch);
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("smoked it");
		}
		
	}

}
