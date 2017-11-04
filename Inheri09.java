class Parent 
{
	Parent(int a)
	{
		System.out.println("hai");
	}

}

class Child extends Parent 
{
	Child()
	{
		super();// compiler will not generate default cons if any constructor is found ie; concusion of this example
		System.out.println("0-argu-----child---constructor");

	}

	

	public static void main(String[] args) 
	{

		new Child();
		
	}

}

/*

E:\core java by ratan\java applications>javac Inheri09.java
Inheri09.java:14: error: constructor Parent in class Parent cannot be applied to given types;
                super();// compiler will not generate default cons if any constructor is found ie; concusion of this example
                ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

*/