
public class AddressBook {

	String firstName, lastName, address, city, state, emailId;
	int zipCode;
	long mobileNumber;

	public void printContact() {
		firstName = "Srikanth";
		lastName = "Naidu";
		address = "Alampure";
		city = "Hyderabad";
		state = "Telangana";
		zipCode = 1234;
		mobileNumber = 9075528520L;
		emailId = "srikanthnaidu019@gmail.com";
		System.out.println("Contact Details");
		System.out.print("Name         : " + firstName + " " + lastName + "\n" + "Address      : " + address + "\n"
				+ "City         : " + city + "\n" + "State        : " + state + "\n" + "ZipCode      : " + zipCode
				+ "\n" + "MobileNumber : " + mobileNumber + "\n" + "EmailId      : " + emailId + "\n");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook addressBook = new AddressBook();
		addressBook.printContact();
	}
}