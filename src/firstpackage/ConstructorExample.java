package firstpackage;

public class ConstructorExample {

	String name;  //null
	int salary;   // 0
	
//	public ConstructorExample() {
//		name = "Rajesh";
//		salary = 40000;
//	}
	
	public ConstructorExample(String name1, int salary1) {
		name = name1;
		salary = salary1;
	}
	
	public static void main(String[] args) {
		
		//ConstructorExample constructorExample = new ConstructorExample(); 
		
//		System.out.println(constructorExample.name);
//		System.out.println(constructorExample.salary);
		
		ConstructorExample constructorExample1 = new ConstructorExample("Ganesh", 30000); 
		
		System.out.println(constructorExample1.name);
		System.out.println(constructorExample1.salary);
		
	}

}
