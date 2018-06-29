
public class Address {

	String street;
	
	String city;
	
	int zip;

	public Address(String street, String city, int zip) {
		super();
		this.street = street;
		this.city = city;
		this.zip = zip;
	}

	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", zip=" + zip
				+ "]";
	}
	
	
	
	
}
