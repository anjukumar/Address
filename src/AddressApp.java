
public class AddressApp {

	public static void main(String[] args) 
	{
      AddressBook a = new AddressBook();
     
      a.setName("Anju"); 
      System.out.println("Name : " +a.getName());
     
      a.setAddress("198 Halpine Rd"); 
      System.out.println("Address :" +a.getAddress());

      a.setCity("Rockville");
      System.out.println("City: " +a.getCity());
      
      a.setState("MD");
      System.out.println("State :  " +a.getState());
      
      a.setEmail("anjuk@gmail.com");
      System.out.println("Email: " +a.getEmail());
     
      a.setphoneNumber("123");
      System.out.println("Telephone : " +a.getphoneNumber());
      
      
      
	}

}
