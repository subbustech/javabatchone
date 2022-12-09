package firstpackage;

public class LoopExample3 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		
		} //End of loop

		//out of loop
		
		System.out.println("End of program");
	}

}
