
// declaring an interface inside a class
class A

{
	interface It2
	{
		void m1();
	}
}
class Child implements A.It2 // nested interface [ Man.Entry ] ~ [MAIN.SUB-INTERFACE]
{

	public void m1()
	{
      System.out.println("please save me baba");
	}
	public static void main(String[] args) 
	{
		new Child().m1();
	}
}
