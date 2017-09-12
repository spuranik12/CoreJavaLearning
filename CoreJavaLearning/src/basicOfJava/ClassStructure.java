//*** POINTS TO REMEMBER ***
// CLASS : when we say class it represents the group of objects. In other words, it's imaginary world
// or blueprint of objects.
// OBJECT : Object has properties and behaviors. Ex: Human being has multiple human objects; Animal has
// multiple animal objects like cat, dog etc. 
// Object Properties Are : For Cat - Color, Height, Weight WHERE AS Behaviors are : Eat, Walk
// MEHTOD : Behavior or Action of objects.

package basicOfJava;

public class ClassStructure 
{
	int i;
	int j;
	
	public void test(int k)
	{
		System.out.println("I am method");
	}
	
	public static void main(String[] args) {
		
		ClassStructure obj = new ClassStructure();
		obj.test(5);
	}
}

//*** CODE EXPLAINATION ***
// First line of class always represents Package
// 'Public' is access of Class
// "int i, int j" are class variables
// Method first String "Public" is access to method
// "int k" is local variable to method
// void is return type of method
// public static void main(String[] args)
// Main method is always static method
// Return type of main method is always void
// Main method return type is always Array of String
