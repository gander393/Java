package examples;

public class StringMethods {

	public static void main(String[] args) {
		String string1 = "hello";
		String string2 = new String("Hello");
		
		System.out.println("String.length():\t\t" + string1.length());
		System.out.println("String.toUpperCase():\t\t" + string1.toUpperCase());
		System.out.println("String.toLowerCase():\t\t" + string1.toLowerCase());
		System.out.println("String.indexOf('e'):\t\t" + string1.indexOf('e'));
		System.out.println("String.lastIndexOf('l'):\t" + string1.lastIndexOf('l'));
		System.out.println("String.charAt():\t\t" + string1.charAt(4));
		System.out.println("\nstring1.equals(string2):\t\t" + string1.equals(string2));
		System.out.println("string1.equalsIgnoreCase(string2):\t" + string1.equalsIgnoreCase(string2));
	}
}
