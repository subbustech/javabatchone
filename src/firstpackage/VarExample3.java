package firstpackage;

public class VarExample3 {
	
	static int a = 30;

	public static void main(String[] args) {
		
		VarExample3 obj1 = new VarExample3();
		VarExample3 obj2 = new VarExample3();
		VarExample3 obj3 = new VarExample3();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);
		
		obj2.a = 50;
		
		System.out.println("---------------------");
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);

	}

}
