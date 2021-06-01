public class ConditionalBlocks {

	public static void main(String[] args) {
		boolean firstCondition = true;
		boolean secondCondition = false;
		
		if (firstCondition) {
			System.out.println("inside the if statement");
			
			if(secondCondition) {
				System.out.println("Inside the nested if statement");
		} 
	}	else if(secondCondition) {
		System.out.println(5);
	}
		else {
			System.out.println("Inside the else statement");
		}
		
		System.out.println("Outside the if statement");
	}
}
