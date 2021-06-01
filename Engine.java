public class Engine extends CarPart{
	private long creationTime;
	private float lifeInMinutes;
	
	//constructor
	public Engine(float yearsOld) {
		super("engine", " years left", 10);
		this.creationTime = System.currentTimeMillis();
		this.lifeInMinutes = 0;
	}
	
	//getter
	public float getLifeInMinutes() { 
		return this.lifeInMinutes; 
	}
	
	//setter
	public void replacePart() {
		super.replacePart();
		this.lifeInMinutes = 0;
	}
	
	public void function(float milesDriven) throws CarCrashException {
		super.function(milesDriven);
		this.lifeInMinutes = (System.currentTimeMillis() - this.creationTime) / 60000f;
		this.setCondition(this.bestCondition - lifeInMinutes);
		if(this.condition <= 0) {
			this.crashCar();
		}else if(this.condition <= 2) {
			this.status("Your engine is getting old!");
			if (getBoolean("Replace?")) {
				this.replacePart();
				this.status("Engine replaced!");
			}
		}else{
			this.status("You'll need a new engine in " + this.condition + " years.");
		}
	}
}
