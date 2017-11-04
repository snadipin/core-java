


interface It1
{
	void m1();
}
interface It2 extends It1
{
	 void m2();
}
interface It3 extends It1,It2
{
	void m3();
}

class Child implements It3
{
	public void m1()
	{
     System.out.println("Hello World!");
	}
	public void m2()
	{
     System.out.println("Hello World!");
	}
	public void m3()
	{
     System.out.println("Hello World!");
	}
	public static void main(String[] args) 
	{
        It3 i = new Child();
		i.m1();
		i.m2();
		i.m3();
	}
}
