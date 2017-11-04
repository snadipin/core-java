

// nested interface


interface It1
{
	interface It2
	{
		void m1();
	}
}
class Child implements It1.It2 // nested interface [ Man.Entry ] ~ [MAIN.SUB-INTERFACE]
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
