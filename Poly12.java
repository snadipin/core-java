
/* rule -6 ~ it is not possible to override the private methods becoz 

private methods are specfic to class and not visible in child class also 

private ~ it is the most ristricted modifier in java*/


class Parent
{
	private void m1()
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

E:\core java by ratan\java applications>javac Poly12.java
Poly12.java:26: error: m1() has private access in Parent
          p.m1();
           ^
1 error


*/
