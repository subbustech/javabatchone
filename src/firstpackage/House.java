package firstpackage;

public class House {

	public static void main(String[] args) {
		
		HousePlan house1 = new HousePlan();
		house1.noOfRooms = 3;
		house1.noOfBalconies = 3;
		
		System.out.println("No of Rooms in house1 are: "+house1.noOfRooms);
		System.out.println("No. of balconies in house1 are: "+house1.noOfBalconies);
	}

}
