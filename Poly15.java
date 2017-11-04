
// increasing permissison

class Parent
{
	protected  void m1()
	{
	System.out.println(" parent method");
	}
}
class Child extends Parent
{
  public  void m1()
	{
		System.out.println("Child Method");
	}

   public static void main(String[] args) 
	{
      Parent p = new Child();
	  p.m1();
	}
}