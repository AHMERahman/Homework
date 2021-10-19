package hw1Q3JavaBasics;

public class My_address {

	public String name = "AHM Rahman";
	public int street = 677;
	public String streetName = "Whitetail Dr";
	public String cityname = "Hummelstown";
	public char State = 'P';
	public int zipcode = 17036;

//	TODO ---- my first to do
	public static void my_address() {
		My_address objAddress = new My_address();
		System.out.println(objAddress.name);
		System.out.println(objAddress.street + " " + objAddress.streetName);
		System.out.println(objAddress.cityname + " " + objAddress.State + " " + objAddress.zipcode);
	}

	public static void main(String[] args) {

		my_address();

	}

}
