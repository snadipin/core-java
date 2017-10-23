class Cons01 
{

    void m1() // instance method
	{
	System.out.println("method");
	}
    Cons01() // 0-argument constructor
	{
	System.out.println("0-argument");
	}
    Cons01(int a) // 1- argument constructor
	{
	System.out.println("one-argument");
	}

	public static void main(String[] args) 
	{
		Cons01 c = new Cons01();
		Cons01 c1= new Cons01(10);

		// by using both reference variables we can access method
		c.m1();
		c1.m1();
	}
}
