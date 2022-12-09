package firstpackage;

public class MethodExample {
	
	public void addNumbers(int num1) {
		System.out.println(num1);
	}
	
	public void addNumbers(float f1) {
		System.out.println(f1);
		
	}
	
//	public void addNumbers(String str1, int num1) {
//		System.out.println(str1 + num1);
//	}

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
//		String str1 = "selenium";
//		
		MethodExample methodExample = new MethodExample();
		methodExample.addNumbers(a);
		methodExample.addNumbers(b);
//		
//		methodExample.addNumbers(a, str1);
		
		//methodExample.addNumbers(str1, a);
		
		int c = 30;
		System.out.println(a);
		//System.out.println(a);
		
		float f = 34.787f;
		System.out.println(f);
		System.out.println(a + " " + f);
		
		String str1 = "Selenium";
		System.out.println(str1);
		
		
	}

}
