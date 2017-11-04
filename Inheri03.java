class A
{
	void m1()
	{
       System.out.println("parent -- m1");
	}
}
class Inheri03 extends A
{
	void m2()
	{
		System.out.println("child -- m2");
	}
	public static void main(String[] args) 
	{

		new Inheri03().m1();
		new Inheri03().m2();
	}
}
