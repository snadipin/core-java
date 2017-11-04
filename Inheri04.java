class A
{
	void m1()
	{
       System.out.println("parent -- m1");
	}
}
class Inheri04 extends A
{
	void m1()
	{

	 super.m1();

		System.out.println("child -- m1");
	}
	public static void main(String[] args) 
	{

		new Inheri04().m1();
		
	}
}
