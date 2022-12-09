package firstpackage;

public class MethodExample3 {
	
	public String concatStrings(String str1, String str2) {
		
		String str3 = str1 +" "+ str2;
		return str3;
		
	}

	public static void main(String[] args) {
		
		String str1 = "subbu";
		String str2 = "selenium";   //subbuselenium
		
		MethodExample3 methodExample = new MethodExample3();
		String str3 = methodExample.concatStrings(str1, str2);
		System.out.println(str3);
		
	}

}
