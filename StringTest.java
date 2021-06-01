package examples;

public class StringTest {

	public static void main(String[] args) {
		String stringA = "Hello";
		String stringB = new String("Hello");
		
		System.out.println("String A: " + stringA);
		System.out.println("String B: " + stringB);
		
		if(stringA == stringB) 
			System.out.println("stringA and stringB point to the same object");
		else
			System.out.println("stringA and stringB do not point to the same object");
	}
}
