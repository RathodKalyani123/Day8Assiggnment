package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteContact {
	
	 static ArrayList<AddressBookSystem> contactList = new ArrayList<>();
	 static Scanner input = new Scanner(System.in);
	 static int count = 0;
	 
	 public static void getcontacts(String lastnamae, String firstname)
	 {
	        AddressBookSystem person = new AddressBookSystem();

	        System.out.println("Enter person first name: ");
	        person.setFirstname(input.next());

	        System.out.println("Enter person last name: ");
	        person.setLastname(input.next());

	        System.out.println("Enter mobile number: ");
	        person.setPhoneno(input.nextLong());

	        System.out.println("Enter the Email id: ");
	        person.setEmail(input.next());

	        System.out.println("Enter address: ");
	        person.setAddress(input.next());

	        System.out.println("Enter city: ");
	        person.setCity(input.next());

	        System.out.println("Enter State name: ");
	        person.setState(input.next());

	        System.out.println("Enter zip: ");
	        person.setZip(input.nextInt());

	        contactList.add(person);
	        System.out.println();
	        System.out.println("contact added");
	       
	        count++;
	        

	 }
	 
	 public static void editcontacts()
	 {
		 int index = 0;
		 boolean Found = false ;
		
		 if(count > 0)
		 {
			 System.out.println("enter first name to edit contact : ");
			 String name = input.next();
			 
			 for(int i = 0 ; i < contactList.size() ; i++ )
			 {
				 if(contactList.get(i).getFirstname().equals(name)) {
	                    
					 Found = true;
                     index = i; 
				 }
				 
			 }

			 
        if (Found)
        { 
        	
         System.out.print("\nEnter new address: ");
         contactList.get(index).setAddress(input.next());

        System.out.println("Enter new city  ");
        contactList.get(index).setCity(input.next());

        System.out.println("Enter new zip: ");
        contactList.get(index).setZip(input.nextInt());

        System.out.println("Enter mobile number: ");
        contactList.get(index).setPhoneno((input.nextLong()));

        System.out.println("Enter the Email id: ");
        contactList.get(index).setEmail(input.next());

        contactList.get(index).setFirstname(name);

        System.out.println("Enter Last Name: ");
        contactList.get(index).setFirstname(input.next());
        
			 }
               else { System.out.println(name+" not found "); }
		
		 }
		 else { System.out.println("add contacts to edit ");  }
			 
		 }
	 
	 public static void deletecontacts()
	 {
		 if(count > 0)
		 {
			 System.out.println("enter first name to edit contact : ");
			 String name = input.next();
		
			 for(int i =0 ; i < contactList.size() ; i++ )
			 {
			        if(contactList.get(i).getFirstname().equals(name)) {
                
				 contactList.remove(i);  }
			 }
		 }
		 System.out.println("deleted contact");
	 }
	 
	 public static void display()
	 {
    
		 System.out.println("no data to display");

		 for  (int i = 0 ; i < contactList.size(); i ++ )
		 {
             System.out.println("FIRST NAME : "+contactList.get(i).getFirstname());
			 System.out.println("LAST NAME :  "+contactList.get(i).getLastname());
			 System.out.println("PHONE NUMBER : "+contactList.get(i).getPhoneno());
			 System.out.println("EMAIL ID  : "+contactList.get(i).getEmail());
			 System.out.println("address : "+contactList.get(i).getAddress());
			 System.out.println("CITY : "+contactList.get(i).getCity());
			 System.out.println("STATE NAME : "+contactList.get(i).getState());
			 System.out.println("ZIP CODE : "+contactList.get(i).getZip());
			 
		 }
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("******************ENTER CHOICE**************************");
    	System.out.println(" ");
    	
    	int choice = 0;
		do {
    	System.out.println(" 1.getcontacts-- \n 2.edit contacts-- \n 3. delete contacts-- \n 4.display contacts ");
    	int ch = input.nextInt();
    
    	         switch(ch)
    	          {
    	  
    	                 case 1: getcontacts();
    	                          break;
    	            
    	                 case 2: editcontacts();
    	                          break;
    	                          
    	                 case 3: deletecontacts();
    	                         break;
    	             
    	                 case 4:  display() ;
    	                           break;
    	             
    	                 default : System.out.println("invalid input");
    	                           break;
    	          }             
    	                	
    	              System.out.println("press '5' to continue....");
    	              choice = input.next().charAt(0);
    	         
    	    }while(choice=='5');

	}

	private static void getcontacts() {
		// TODO Auto-generated method stub
		
	}

}



