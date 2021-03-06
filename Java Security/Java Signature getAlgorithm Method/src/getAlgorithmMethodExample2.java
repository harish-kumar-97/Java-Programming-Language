/*
 * Java program to demonstrate getAlgorithm() method
 */

import java.security.*;
import java.util.*;

public class getAlgorithmMethodExample2 {

	public static void main(String[] args) {
		try {
			// creating the object of Signature
			Signature sr = Signature.getInstance("NONEwithDSA");
			
			// getting the Algorithm by using method getAlgorithm()
			String algo = sr.getAlgorithm();
			
			// printing the string algorithm
			System.out.println("Algorithm: " + algo);
		} catch(NoSuchAlgorithmException e) {
			System.out.println("Exception thrown: " + e);
		}
	}
}
