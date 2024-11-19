package test;

import java.util.HashMap;


interface ContactManagerInterface
{
	public boolean addContact(Contact c);
	public boolean deleteContact(Contact c);
	public boolean updateContact(Contact c);
	public boolean viewContact(Contact c);
}


 class ContactManager implements ContactManagerInterface{
	 
	 public  HashMap<String, Contact> h = new HashMap<>();
	
	public boolean addContact(Contact c)
	{
		if(c.phone.length() ==10)
		{
			h.put( c.phone, c );
			if(h.containsKey( c.phone ))
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		}
		else
			return false;
	    
	}
	
	public boolean deleteContact(Contact c)
	
	{
		if(c.phone.length() ==10)
		{
			h.remove( c.phone, c );
			if(!h.containsKey( c.phone ))
			{
				return true;
			}
		
			else
				return false;
		}
		else
		return false;
	}
	public boolean  updateContact(Contact c)

	{
		
		if(c.phone.length() ==10)
		{
			
			if(h.containsKey( c.phone ))
			{
				Contact contact = h.get(c.phone);
				contact.phone = "9345689012";
				contact.firstName="sumanth";
				
				 
				return true;
			}
			else
				return false;
		}
		
		else
			return false;
		
	}
	
	public boolean viewContact(Contact c) {
	    if (h.containsKey(c.phone)) {
	        Contact contact = h.get(c.phone);
	        System.out.println("Contact Found: " + contact.firstName + " " + contact.lastName + ", Phone: " + contact.phone);
	        return true;
	    } else {
	        throw new IllegalArgumentException("Contact not found in the system.");
	    }
	}


	
}
