public class SomeClass {

	long serialNumber;
	
	public SomeClass() {
		this(101L);
		System.out.println("Inside the default constructor");
	}
	
	public SomeClass(long serialNumber) {
		this.serialNumber = serialNumber;
		System.out.println("Inside constructor with parameter");
	}
	
	public static void main(String[] args) {
		SomeClass sc = new SomeClass();
	}
}
