public class ClassA {
	int id;

	public ClassA() {
		System.out.println("Inside the constructor.");
		id = 1;
	}
	
	public ClassA(int inputId) {
		System.out.println("Inside the constructor. " + id);
		id = inputId;
	}
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		System.out.println("After instantiation. " + a.id);
		
		ClassA a2 = new ClassA(3);
		System.out.println("After instantiation. " + a2.id);
	}
}
