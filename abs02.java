
// main method can be delclared in abstract class ---

abstract class Parent
{
	abstract void m1();
	public static void main(String ... arg)
	{

	}
} 

class Child extends Parent
{
	void m1()
	{
		System.out.println("test");
	}

	public static void main(String ... arg)
	{
       
	   Child c =new Child();
	   c.m1();

	}

}