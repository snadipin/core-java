
/* private modifier in java 

  private modifier in java appllicable in variabeles and methods

  if any class members (var & methods) is declared with private modifier then, there are able to access within class only
  
  it is so called most restricted modifier in java*/

class Parent  
{
	private void m1()
	{
		System.out.println(" hello");
	}
}
class Child extends Parent
{

	public static void main(String[] args) 
	{
		Parent p = new Parent();
		p.m1();
	}
}


/* 
E:\core java by ratan\java applications>javac Poly11.java
Poly11.java:14: error: m1() has private access in Parent
                p.m1();
                 ^
1 error
*/