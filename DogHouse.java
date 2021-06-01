public class DogHouse {

	Dog d;
	
	public DogHouse() {
		d = new Dog();
		d.setName("Ralph");
	}
	
	public String getOwner() {
		return d.getName();
	}
	
	public static void main(String[] args) {
		DogHouse house = new DogHouse();
		
		house.d.talk();
		System.out.println("This is belongs to: " + house.getOwner());
	}
}
