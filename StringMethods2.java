public class StringMethods {

	public static void main (String[] args) {
		String str = "Hello";
		String s = new String("Hello");
		System.out.println(str.equals(s));
		
		//use length() method
		System.out.println(str.length());
		
		//use indexOf() method
		System.out.println(str.indexOf('H'));
	}
}
