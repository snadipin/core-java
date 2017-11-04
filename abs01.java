abstract class Parent 
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
abstract class Child1 extends Parent
{
	void m1()
	{
      System.out.println("i know only m1 method implementation"); // becoz of only one implementation this is also abstract class 
	            // object creation  not possible
	}
}
class Child2 extends Child1
{
	void m2()
	{
      System.out.println("i know only m2 method implementation");
	}
	void m3()
	{
      System.out.println("i know only m3 method implementation");
	}

	public static void main(String[] args) 
	{
		Child2 c = new Child2();
		c.m1();
		c.m2();
		c.m3();
	}
}
