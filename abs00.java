


// abstract class :-process of highlighting set of services and hinding the implemattions in the child classes is called abstraction.

// for abstract class , object creation is not possible.


abstract class Parent 
{
	abstract void m1(); // abstract class
	abstract void m2();
	abstract void m3();
	void m4()
	{
		System.out.println("abstract  method");
	}
}

class Child extends Parent
{
  void m1()
	{
      System.out.println("m1");
	}
   void m2()
	{
      System.out.println("m2");
	}
	 void m3()
	{
      System.out.println("m3");
	}
	public static void main(String[] args) 
	{
	   //Child c = new Child();   // valid 
	   //Parent p = new Parent();

	   Parent c= new Child();  // also valid
	   c.m1();
	   c.m2();
	   c.m3();
	   c.m4();
	}
}

/* error if you try to create an object for parent class
 
  E:\core java by ratan\java applications>javac abs00.java
abs00.java:37: error: Parent is abstract; cannot be instantiated
           Parent p = new Parent();
                      ^
1 error  */