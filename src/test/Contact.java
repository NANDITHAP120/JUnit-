package test;

public class Contact
{
	String firstName,lastName,phone;
	
	
	Contact(String firstName,String lastName,String phone)
	{
		this.firstName = firstName;
		this.lastName=lastName;
		this.phone=phone;
		
	}
	
	public String toString() {
        return "Contact [First Name: " + firstName + 
               ", Last Name: " + lastName + 
               ", Phone: " + phone + "]";
    }
}

