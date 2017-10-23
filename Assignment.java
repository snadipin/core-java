class Assignment
{
  int a = 20; // instance variables
  int b = 30;

  static void m1()  // static method
	{
	  Assignment A = new Assignment(); // static area created an object to access instance variables
	  System.out.println(A.a);
	  System.out.println(A.b);

	}
	static void m2()  // static method
	{
		Assignment A = new Assignment();
	System.out.println(A.a);
	 System.out.println(A.b);

	}
	public static void main(String[] args) // static area created an object to access instance variables
	{
		System.out.println("Hello World!");
		
		Assignment.m1(); // static area and static methods are called by using Class name
		Assignment.m2();
		m1();
	}
}
