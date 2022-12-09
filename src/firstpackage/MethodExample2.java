package firstpackage;

public class MethodExample2 {
	
	
	public float addNumbers(float num1, float num2) {
		
		float c = num1 + num2;
		return c;
		
	}

	public static void main(String[] args) {
		
		float a = 10.345f;
		float b = 20.8768f;
		
		MethodExample2 methodExample = new MethodExample2();
		float c = methodExample.addNumbers(a, b);
		System.out.println(c);
		
	}

}
