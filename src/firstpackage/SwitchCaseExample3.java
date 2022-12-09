package firstpackage;

public class SwitchCaseExample3 {

	public static void main(String[] args) {

		String shortMonth = "afdasdf";

		switch(shortMonth) {
		case "jan":
			System.out.println("January");
			break;
		case "feb":
			System.out.println("February");
			break;
		case "mar":
			System.out.println("March");
			break;
		default:
			System.out.println("Wrong Input");
			break;
		}

	}

}
