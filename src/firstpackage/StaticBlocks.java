package firstpackage;

public class StaticBlocks {

	private static String name;
	static int salary;
	
	static {
		System.out.println("I am static block 1");
		name = "Rajesh";
		salary = 30000;
	}
	
	static {
		System.out.println("I am static block 2");
		name = "Ganesh";
		salary = 40000;
	}
	
	public static void main(String[] args) {
		
		System.out.println("I am main method");

	}

}
