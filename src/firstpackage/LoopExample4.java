package firstpackage;

public class LoopExample4 {

	public static void main(String[] args) {
		
		outerloop: for(int i=1; i<=3; i++) {
			
			System.out.println("I am outside for loop - "+i);
			
			for(int j=1; j<=3; j++) {
				if(i == 2) {
					continue outerloop;
				} 
				System.out.println("--- I am inside for loop - "+j);
			}
					
		}
		
		System.out.println("Rest of program");
		
		System.out.println("End of program");
	}

}
