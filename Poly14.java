class Parent
{
	protected void m1()
	{
	System.out.println(" parent method");
	}
}
class Child extends Parent
{
   void m1()
	{
		System.out.println("Child Method");
	}

   public static void main(String[] args) 
	{
      Parent p = new Child();
	  p.m1();
	}
}


/*
E:\core java by ratan\java applications>javac Poly14.java
Poly14.java:10: error: m1() in Child cannot override m1() in Parent
   void m1()
        ^
  attempting to assign weaker access privileges; was protected
1 error
*/