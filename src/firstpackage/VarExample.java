package firstpackage;

public class VarExample {

	static int a = 10; //using classname
	int b = 30; //using object
	
	public void test1() {
		int c = 40;
		System.out.println(b);
	}
	
	public static void test2() {
		System.out.println(a);
		VarExample v1 = new VarExample();
		System.out.println(v1.b);
	}
	
	public static void main(String[] args) {
		
		int c = 400;
		
		for(int i=0; i<10; i++) {
			int a = 20; 
			System.out.println(a);
		}
		
		System.out.println("c value is "+c);
		
		VarExample varExample1 = new VarExample();
		VarExample varExample2 = new VarExample();
		
		System.out.println(varExample1.a);
		System.out.println(varExample1.b);
		
		System.out.println(varExample2.a);
		System.out.println(varExample2.b);
		
		varExample2.a = 100;
		varExample2.b = 300;
		
		System.out.println("---------------------------");
		
		System.out.println(varExample1.a);
		System.out.println(varExample1.b);
		
		System.out.println(varExample2.a);
		System.out.println(varExample2.b);
		
	}

}
