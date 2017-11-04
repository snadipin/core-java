
interface  It1 // abstract
{
	void m1();
	void m2();  // abstarct , public
	void m3();
}

abstract class Child1 implements It1
{
    public void m1()    // if not public you will below error; while overriding we should not decrease the permissions
	{
        System.out.println("m1");
	}

}


class Child2 extends Child1
{
 

    public void m2()
	{
        System.out.println("m2");
	}
	public  void m3()
	{
        System.out.println("m3");
	}
	public static void main(String[] args) 
	{
		/*Child c = new Child();
		c.m1();
		c.m2();
		c.m3(); */
        Child1 i = new Child2();  //perfectly valid it acn able to hold implementation object
		i.m1();
		i.m2();
		i.m3();
	}
}