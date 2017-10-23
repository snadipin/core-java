class Assign02 
{
	int a=10;
	int b=8;
	static boolean c=true;
	static char d='s';

	void m1()
	{

		System.out.println(a);
		System.out.println(b);
		System.out.println(Assign02.c);
		System.out.println(Assign02.d);

	}

	static void m2()
	{
        Assign02 A = new Assign02();
		System.out.println(A.a);
		System.out.println(A.b);
		System.out.println(Assign02.c);
		System.out.println(Assign02.d);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Assign02 A = new Assign02();
		A.m1();
		A.m2();
         

	}
}
