public class Wipers extends CarPart{
	private float fluidLeft;
	
	//constructor
	public Wipers(int capacityGallons, float fluidLeft) {
		super("wiper fluid", "gallons", capacityGallons);
		this.fluidLeft = fluidLeft;
	}
	
	//getter
	public float getFluidLeft() {
		return this.fluidLeft;
	}
	
	//setters
	public void refill(float numOfGallons) {
		float remainder = this.bestCondition - this.condition;
		if(this.condition < 0) {
			this.status("Nice try., but you can't steal my wiper fluid with a negative number! Adding " + remainder + "gallon(s) to reach capacity.");
			this.setCondition(this.bestCondition);
		}else if(numOfGallons > remainder) {
			this.status("Too mutch! Only adding " + remainder + "gallon(s) to reach capacity.");
			this.setCondition(this.bestCondition);
		}else{
			this.status("Adding " + numOfGallons + "gallon(s). You now have " + this.condition + numOfGallons + " gallons.");
			this.changeCondition(numOfGallons);
		}
	}
	
	public void function(float timesUsed) throws CarCrashException {
		super.function(timesUsed);
		float gallonsConsumed = timesUsed / this.fluidLeft;
		this.changeCondition(-1 * gallonsConsumed);
		if(this.condition <= 0) {
			this.crashCar();
		}else if(this.condition <= (this.bestCondition / 4)) {
			this.status("Low on wiper fluid!");
			if(getBoolean("Refill?")) {
				this.refill(getFloat("How many gallons would you like to add?"));
			}
		}
		if((this.condition / this.bestCondition) <= 0.25) {
			this.status("Your wiper fluid is running low.");
		}else{
			this.status("You're good on wiper fluid.");
		}
	}
	
}
