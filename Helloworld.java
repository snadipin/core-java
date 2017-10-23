class  Test
{
	int y=500; // instance variables
	int z=225;
	public static void main(String[] args) // static method 
	{
		int a=20; // local variables
		int b=40;
		System.out.println("Hello World!");
		System.out.println(a+b);

		Test t = new Test();
		System.out.println(t.z);
		System.out.println(t.y);
		
		Test.m1();
		}

		   static void m1() // instance method
	{
		 Test t = new Test();
		    
			System.out.println(t.z);
	}
}
