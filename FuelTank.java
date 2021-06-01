public class FuelTank extends CarPart{

	private float milesPerGallon;
	
	//constructor
	public FuelTank(int capacityGallons, float milesPerGallon) {
		super("fuel tank", " gallons", capacityGallons);
		this.milesPerGallon = milesPerGallon;
	}
	
	//getter
	public float getMPG() { 
		return this.milesPerGallon; 
	}
	
	//setters
	public void fillTank(float numOfGallons) {
		float remainder = this.bestCondition - this.condition;
		if(this.condition < 0) {
			this.status("Nice try, but you can't steal my fuel with a negative number! Adding " + remainder + " gallons to reach capacity.");
			this.setCondition(this.bestCondition);
		}else if(numOfGallons > remainder) {
			this.status("Too much! Only adding " + remainder + " gallons to reach capacity.");
			this.setCondition(this.bestCondition);
		}else{
			this.status("Adding " + numOfGallons + " gallons. You now have "
					+ this.condition + numOfGallons + " gallons.");
			this.changeCondition(numOfGallons);
		}
	}
	
	public void function(float milesDriven) throws CarCrashException{
		super.function(milesDriven);
		float gallonsConsumed = milesDriven / this.milesPerGallon;
		this.changeCondition(-1 * gallonsConsumed);
		if(this.condition <= 0) {
			this.crashCar();
		}else if (this.condition < (this.bestCondition / 4)) {
			this.status("Low on fuel!");
			if(getBoolean("Refill?")) {
				this.fillTank(getFloat("How many gallons would you like to add?"));
			}
		}
		if((this.condition / this.bestCondition) <= 0.5) {
			this.status("Your fuel tank is less than half full.");
		}else{
			this.status("You're good on fuel.");
		}
	}
}
