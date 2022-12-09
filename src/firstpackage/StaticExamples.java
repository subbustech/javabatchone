package firstpackage;

public class StaticExamples {

	static int count = 0;
	
	public void incrementCount() {
		count++;
	}
	
	public int returnCount() {
		return count;
	}
	
	public static void main(String[] args) {
		
		StaticExamples obj1 = new StaticExamples();		
		System.out.println(obj1.returnCount());
		
		obj1.incrementCount();
		System.out.println(obj1.returnCount());
		
		StaticExamples obj2 = new StaticExamples();
		System.out.println(obj2.returnCount());
	}

}
