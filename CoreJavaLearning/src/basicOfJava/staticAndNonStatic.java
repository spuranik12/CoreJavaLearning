//*** POINTS TO REMEMBER ***
// Static members of class are accessed by class name. Static Members are class members.
// Non static members of class are accessed by objects. Non static members are object members.

package basicOfJava;

public class staticAndNonStatic 
{
	int i;
	static int j;
	
	//non static
	public void test1()
	{
		
	}
	
	public void test2()
	{
		// We can access static & non static members for non-static method as shown in test2() method.
		
		int a = i; //accessible with non static variable
		
		int k = j; //accessible with static variable
		
	}
	
	//static
	public static void test3()
	{
		
	}
	
	public static void main(String[] args) {
		staticAndNonStatic obj1 = new staticAndNonStatic();
		obj1.test1();
		obj1.test2();
		System.out.println(obj1.i);
		
		// *** Here this throws compilation error as 'i' is non static so cannot be accessed by class name as below:-
		// staticAndNonStatic.i; 
		// staticAndNonStatic.test1();
		
		// *** We can't call non static method though class reference. if we try to do that we will get compile time error. Since non static members are object members
		
		staticAndNonStatic.test3();
		System.out.println(staticAndNonStatic.j);
		
		// *** static members can be accessed using class reference as mentioned in above two lines.
		// Here test1() and test2() methods are calling using object reference as they are non-static.
		// **** As main method is static, hence we cannot call non-static members. Whereas, non static method can access both static as well as non static members. ***
	}
	
	// *** Lets take another method and go through the concept.
	public static void test4()
	{
		 // int a = i;
		
		 // -> Here we are trying to access non static variable into static method, which is not possible and will encounterd with compile time error.
	}
}
