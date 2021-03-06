/*
 * Java program to demonstrate getInstance() method
 */

import java.security.*;
import java.util.*;

public class getInstance_method_Ex1 {

	public static void main(String[] args) {
		
		try
		{
				// creating the object of SecureRandom and getting instance by using getInstance() method
			System.out.println("Trying to get the instance of TAJMAHAL");
			SecureRandom sr = SecureRandom.getInstance("TAJMAHAL");
			
			// Declaring the string variable
			String str = "TajMahal";
			
			// Declaring the byte Array converting string into byte
			byte[] b = str.getBytes();
			
			// printing the byte array
			System.out.println("Byte array before operation: " + Arrays.toString(b));
			
			// generating user specified number of random bytes using nextBytes() method
			sr.nextBytes(b);
			
			// printing the new byte array
			System.out.println("Byte array after operation: " + Arrays.toString(b));
		}
		catch(NoSuchAlgorithmException e) {
				System.out.println("Exception thrown: " + e);
		}
		catch(ProviderException e) {
				System.out.println("Exception thrown: " + e);
		}
	}
}
