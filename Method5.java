/* method calling anthoer method ALSO IMP */

class Method5
{
	void m1()   
	{ 
	   Method5.m2();    // as m1() method is calling m2(), first m2() will excute then only m1()
	   System.out.println("M-1");	
	}
	static void m2()
	{
		Method5 m= new Method5();
	
	   m.m3(10);
	   System.out.println("M-2");	
	}
	void m3(int a)
	{
	   System.out.println("M-3");	
	}

	public static void main(String[] args) 
	{
		Method5 m= new Method5();
		m.m1();

	}
}