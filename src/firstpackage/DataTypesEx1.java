package firstpackage;

public class DataTypesEx1 {

	static byte b;
	short s;
	int i;
	long l;
	
	float f;
	double d;
	
	char c;   //    \u0000
	boolean bool;
	
	public static void main(String[] args) {
		
		DataTypesEx1 obj1 = new DataTypesEx1();
		
		System.out.println(b);
		System.out.println(obj1.s);
		System.out.println(obj1.i);
		System.out.println(obj1.l);
		
		System.out.println(obj1.f);
		System.out.println(obj1.d);
		
		System.out.println(obj1.c);
		System.out.println(obj1.bool);

	}

}
