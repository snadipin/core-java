class Method13 
{
	Method13 m1()  // method return type is same class
	{
		Method13 m = new Method13();
		return m;
	}

	Method13 m2()
	{
		return this;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

	   Method13 m = new Method13();
	    Method13 p=m.m1();
		Method13 y=m.m2();
       System.out.println(p);
	   System.out.println(y);

	}
}
