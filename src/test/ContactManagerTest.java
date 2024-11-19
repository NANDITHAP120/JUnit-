package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactManagerTest {
	
     
	Contact c;
	ContactManager c1=new ContactManager();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp()throws Exception
	{
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void testIfValidContactAdded() {
		c=new Contact("Nanditha","Peringeth","9108956781");
		
		assertTrue(c1.addContact( c ));
		
		
	}
	@Test
	void testIfInvalidContactAdded() {
		c=new Contact("Nanditha","Peringeth","910895678");
		assertFalse(c1.addContact( c ));
	}
	@Test
	void testIfCanAddContact() {
		c=new Contact("Nanditha","Peringeth","9108956789");
		assertTrue(c1.addContact( c ));

	}
	
	@Test
	void tesIfValidContactIsDeleted()
	{
		c=new Contact("Nanditha","Peringeth","9108956789");
		assertTrue(c1.deleteContact( c ));
	}
	@Test
	void tesIfInvalidContactIsDeleted()
	{
		c=new Contact("Nanditha","Peringeth","910895678");
		assertFalse(c1.deleteContact( c ));
	}
	@Test
	void tesIfContactDeleted()
	{
		c=new Contact("Nanditha","Peringeth","9108956789");
		assertTrue(c1.deleteContact( c ));
	}
	@Test
	void tesIfValidContactOnlyIsUpdated()
	{
		c=new Contact("Sumitha","Peringeth","9148678903");
		c1.addContact( c );
		
		assertTrue(c1.updateContact( c ));
	}
	@Test
	void tesIfInvalidContactIsNotUpdated()
	{
		c=new Contact("Sumitha","Peringeth","914867890");
		c1.addContact( c );
		
		assertFalse(c1.updateContact( c ));
	}
	@Test
	void tesIfContactIsUpdated()
	{
		c=new Contact("Sumitha","Peringeth","9148678901");
		c1.addContact( c );
		
		assertTrue(c1.updateContact( c ));
	}
	@Test
	void testIfValidContactIsViewed() {
	    c = new Contact("Praseetha", "P", "9876543210");
	    c1.addContact(c);
	    assertTrue(c1.viewContact(c));
	}

	@Test
	void testIfInvalidContactThrowsException() {
	    c = new Contact("Jane", "Doe", "1425788907");
	    Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.viewContact(c));
	    assertEquals("Contact not found in the system.", exception.getMessage());
	}

	@Test
	void testIfNullContactThrowsException() {
	    Exception exception = assertThrows(NullPointerException.class, () -> c1.viewContact(null));
	    
	}

	
}
	
	
	


