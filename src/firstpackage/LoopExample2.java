package firstpackage;

public class LoopExample2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			
			System.out.println("I am outside for loop");
			
			for(int j=1; j<=5; j++) {
				System.out.println("---- I am inside for loop");
			}
		
		}

	}

}
