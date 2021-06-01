public class AC extends CarPart{

	private float psiPerOzFreon;
	
	//constructor
	public AC(int capacityOz, float psiPerOzFreon) {
		super("resivoir", "ounces", capacityOz);
		this.psiPerOzFreon = psiPerOzFreon;
	}
	
	//getter
	public float getPSI() {
		return psiPerOzFreon;
	}
	
	//setters
	public void refill(float numOfOunces) {
		float remainder = this.bestCondition - this.condition;
		if(this.condition < 0) {
			this.status("Nice try, but you can't steal my freon with a negative number! Adding " + remainder + "ounces to reahc capacity.");
			this.setCondition(this.bestCondition);
		}else{
			this.status("Adding " + numOfOunces + "ounces. You now have " + this.condition + numOfOunces + " ounces.");
			this.changeCondition(numOfOunces);
		}
	}
	
	public void function(float timesUsed) throws CarCrashException {
		super.function(timesUsed);
		float ouncesConsumed = timesUsed / this.psiPerOzFreon;
		this.changeCondition(-1 * ouncesConsumed);
		if(this.condition <= 0) {
			this.crashCar();
		}else if(this.condition <= (this.bestCondition / 4)) {
			this.status("Low on freon!");
			if(getBoolean("Refill?")) {
				this.refill(getFloat("How many ounces would you like to add?"));
			}
		}
		if((this.condition / this.bestCondition)<= 4) {
			this.status("Your freon level is low.");
		}else{
			this.status("You're good on freon.");
		}
	}
}
