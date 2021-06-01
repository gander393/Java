public class WaterSystem {
	
	public static void main(String args[]){

		   int precipitation = 0;

		   int waterOutput = 0;

		   int temperature = 80;

		 

		   //start an if-statement

		   if (precipitation < 20){
		     if (temperature <= 75){

		       waterOutput = 30;

		     }

		     else {

		       waterOutput = 45;

		     }

		   }

		 

		 

		   System.out.println("The water output should be " + waterOutput);

	}

}
