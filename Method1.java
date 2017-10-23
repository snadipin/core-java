/* normal method */

class Method1 
{
	void m1()
	{
	   System.out.println("INSTANCE METHOD");	
	}
	static void m2()
	{
	   System.out.println("STATIC METHOD");	
	}

	public static void main(String[] args) 
	{
		Method1 m= new Method1();
		m.m1();
		Method1.m2();

	}
}
