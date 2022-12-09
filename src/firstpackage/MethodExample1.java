package firstpackage;

public class MethodExample1 {
	
	
	public int addNumbers(int num1, int num2) {
		
		int c = num1 + num2;
		return c;
		
	}

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		MethodExample1 methodExample = new MethodExample1();
		int c = methodExample.addNumbers(a, b);
		System.out.println(c);
		
		int d = 40;
		int e = 50;
		int f = methodExample.addNumbers(d, e);
		System.out.println(f);
		
		

	}

}
