package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class EditContact {

	ArrayList<EditContact> contactList=new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int count=0;
		
		void getcontct()
		{
			EditContact person = new EditContact();
			
			System.out.println("enter first name");
			person.setfirstnamr(input.next());
		
			System.out.println("enter last name");
			person.setlastname(input.next());
			
			System.out.println("enter city");
			person.setcity(input.next());
			
			System.out.println("enter phoneno");
			person.setphoneno(input.next());
			
			System.out.println("enter state");
			person.setstate(input.next());
			
			System.out.println("enter zip");
			person.setzip(input.next());
			
			System.out.println("enter Address");
			person.setAddress(input.next());
			
			System.out.println("enter email");
			person.setemail(input.next());
			
			contactList.add(person);
			System.out.println();
			System.out.println("contact added");
			count++;
			
			System.out.println("size: "+contactList.size());
		}

		private void setemail(String next) {
			// TODO Auto-generated method stub
			
		}

		private void setAddress(String next) {
			// TODO Auto-generated method stub
			
		}

		private void setzip(String next) {
			// TODO Auto-generated method stub
			
		}

		private void setstate(String next) {
			// TODO Auto-generated method stub
			
		}

		private void setphoneno(String next) {
			// TODO Auto-generated method stub
			
		}

		private void setcity(String next) {
			// TODO Auto-generated method stub
			
		}

		private void setlastname(String next) {
			// TODO Auto-generated method stub
			
		}

		private void setfirstnamr(String next) {
			// TODO Auto-generated method stub
			
		}
		
	}


