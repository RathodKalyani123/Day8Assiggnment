package AddressBook;

import java.util.Scanner;

public class AddressBookSystem {
	
	static String firstname;
	static String lastname;
	static String address;
	static String city;
	static String state;
	static int zip;
	static long phoneno;
	static String email;
	private char[] editcontacts;
	private char[] deletecontact;
	
	
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getZip() {
		return zip;
	}


	public void setZip(int zip) {
		this.zip = zip;
	}


	public long getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	 	

	@Override
	public String toString() {
		return "AddressBookSystem [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", phoneno=" + phoneno + ", email=" + email
				+ "]";
	}


	public AddressBookSystem() {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneno = phoneno;
		this.email = email;
	}


	public static void main(String[] args) {
		System.out.println("Welcome To Address Book");
		
		
		
		 AddressBookSystem person = new AddressBookSystem();

	        System.out.println("add person details");
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter First name: ");
	        person.setFirstname(scanner.next());

	        System.out.println("Enter Last name: ");
	        person.setFirstname(scanner.next());

	        System.out.println("Enter Mobile Number: ");
	        person.setPhoneno(scanner.nextLong());

	        System.out.println("Enter  Email id: ");
	        person.setEmail(scanner.next());

	     
	        System.out.println("Enter Address: ");
	        person.setAddress(scanner.next());

	        System.out.println("Enter City: ");
	        person.setCity(scanner.next());

	        System.out.println("Enter State : ");
	        person.setState(scanner.next());

	        System.out.println("Enter Zip: ");
	        person.setZip(scanner.nextInt());

	        System.out.println("****************Person details******************** ");
	        System.out.println(" ");
	        
	        System.out.println("FirstName    : "+person.firstname);
	        System.out.println("LastName     : "+person.lastname);
	        System.out.println("PhoneNumber  : "+person.phoneno);
	        System.out.println("Email id     : "+person.email);
	        System.out.println("Address      : "+person.address);
	        System.out.println("City         : "+person.city);
	        System.out.println("State        : "+person.state);
	        System.out.println("Zip          : "+person.zip);
	
	        System.out.println("#########################################################");
	        System.out.println(person.editcontacts);
	        System.out.println(person.deletecontact);
	
	
	}


	
	public void setLastname1(String next) {
		// TODO Auto-generated method stub
		
	}
	




		
		
	}
  

