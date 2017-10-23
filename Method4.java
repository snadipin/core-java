class Method4
{
	void m1()
	{
	   System.out.println("INSTANCE METHOD");	
	}
	void m1(int a)
	{
	   System.out.println("STATIC METHOD");	
	}

	public static void main(String[] args) 
	{
		Method4 m= new Method4();
		m.m1();
		m.m1(20);

	}
}
