


/*instance vs static  variables

the main diff. is For every object we create new memory is allocated , so in below example out is of a is 10

but for static variables only once the memory is allocated and it is only updated as below so every time we update that value is our outpu */


class Subbu 
{
	int a=20;
	static int b=52;

	/*void m1()
	{
        Subbu s = new Subbu();
		System.out.println(s.a);
		s.a=20;
		s.b=3333;
		System.out.println(Subbu.b);

	}*/
	public static void main(String[] args) 
	{
       Subbu s = new Subbu();
	   System.out.println(s.a);
	   System.out.println(s.b);
	   s.a=999;
	   s.b=888;

	   Subbu s1 = new Subbu();
	   System.out.println(s1.a);
	   System.out.println(s1.b);
	   s1.a=9999;
	   s1.b=8888;

	   Subbu s2 = new Subbu();
	   System.out.println(s2.a);
	   System.out.println(s2.b);


	}
}
