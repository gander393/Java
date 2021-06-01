package examples;

public class MyFirstProgram {
	
	public static void message(String myString, int myInt) {
		System.out.println("This is my string: " + myString);
		System.out.println("and this is my int: " + myInt);
	}

	public static void main(String[] args) {
		message("Hello world!", 4);
	}

}
