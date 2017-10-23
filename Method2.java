class Method2
{
	void m1( int a,char b) // local  variables
	{
	   System.out.println("INSTANCE METHOD");
	   System.out.println(a);

	   System.out.println(b);
	}
	static void m2(double d,String e)
	{
	   System.out.println("STATIC METHOD");	
	   System.out.println(d);

	   System.out.println(e);
	}

	public static void main(String[] args) 
	{
		Method2 m= new Method2();
		m.m1(999,'N');
		Method2.m2(23.6,"Nadipineni");

	}
}