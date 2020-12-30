/*
 * Java program to demonstrate accessing a inner class
 */

// outer class
class OuterClass1
{
	// static member
	static int outer_x = 10;
	
	// instance(non-static) member
 	int outer_y = 20;
 	
 	// private member
 	private int outer_private = 30;
 	
 	// inner class
 	class InnerClass
 	{
 		void display()
 		{
 			// can access static member of outer class
 			System.out.println("outer_x = " + outer_x);
 			
 			// can also access non-static member of outer class
 			System.out.println("outer_y = " + outer_y);
 			
 			// can also access private member of outer class
 			System.out.println("outer_private = " + outer_private);
 		}
 	}
}

// Driver class
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// accessing an inner class
		OuterClass1 outerObject = new OuterClass1();
		OuterClass1.InnerClass innerObject = outerObject.new InnerClass();
		
		innerObject.display();
	}
}