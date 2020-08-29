package com.xworkz.string.assignment;

public class ReverseAString {

	public static void main(String[] args) {

		String name = "Manjunath is an Engineer";

		String s = new String();

		StringBuffer buffer = new StringBuffer();

		buffer.append(name);
		System.out.println(buffer.reverse());

		System.out.println(name.length());
		// System.out.println(buffer.length());

		char[] c = new char[name.length()];

		for (int i = 0; i < name.length(); i++) {
			c[i] = name.charAt(i);
		}

		for (char n : c) {
			System.out.print(n + " ");
		}

	}

}
