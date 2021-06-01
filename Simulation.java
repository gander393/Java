package com.Garrett.exceptions;

import java.util.Scanner;

public class Simulation {

	public static void main(String[] args) throws EvenNumberException {
		getInput();
	}
	
	public static void getInput() throws EvenNumberException {
		Scanner in = new Scanner(System.in);
		
		//get user input
		System.out.println("Type in a number and hit Enter...");
		
		String line = in.nextLine();
		System.out.println("You typed " + line);
		
		//test if number is even, through exception if true
		if(isEven(line)) {
			try {
				throw new EvenNumberException();
			}finally {
				in.close();
			}
		}
		
		//close resources
		in.close();
	}
	
	public static boolean isEven(String num) {
		//convert value to a number
		int value = Integer.parseInt(num);
		
		return (value % 2 == 0);
	}
}
