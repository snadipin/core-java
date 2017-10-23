class Method14 
{
	int a =10; // instance
	int b=20 ;
	int m1(int a , int b) // local vvariables
	{
       System.out.println("method");

	   return this.a;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Method14 m=new Method14();
		int s=m.m1(99999,000);
		System.out.println(s);
 	}
}
