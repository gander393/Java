public class ExampleOne {
	
	public static int staticVar = 0;
	public int instanceVar = 0;
	
	public ExampleOne() {
		this.instanceVar++;
		staticVar++;
	}

	public static void main(String[] args) {
		ExampleOne.wakeUp();
		
		ExampleOne thingA = new ExampleOne();
		ExampleOne thingB = new ExampleOne();
		
		System.out.println(thingA.instanceVar);
		System.out.println(thingB.instanceVar);
		System.out.println(ExampleOne.staticVar);
	}
	
	public static void wakeUp() {
		System.out.println("wake up");
	}
}
