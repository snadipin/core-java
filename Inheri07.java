

// both super and this cannot called at time


class Parent 
{
	Parent()
	{
		System.out.println("parent -- constructor");
	}


}

class Child extends Parent 
{
	Child()
	{
		this(10); // calling child class one argument cons
		super();
		System.out.println("0-argu-----child---constructor");

	}

	Child(int a)
	{
		super(); // calling super class constructor
		System.out.println("01-argu-----child---constructor");

	}

	public static void main(String[] args) 
	{

		new Child();
		
	}

}


/*

E:\core java by ratan\java applications>javac Inheri06.java
Inheri06.java:24: error: call to super must be first statement in constructor
                super(); // calling super class constructor
                     ^
1 error

E:\core java by ratan\java applications>javac Inheri07.java
Inheri07.java:16: error: call to super must be first statement in constructor
                super();
                     ^
1 error */