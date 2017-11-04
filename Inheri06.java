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
		System.out.println("0-argu-----child---constructor");

	}

	Child(int a)
	{
		
		System.out.println("01-argu-----child---constructor");
		super(); // calling super class constructor

	}

	public static void main(String[] args) 
	{

		new Child();
		
	}

}

/*E:\core java by ratan\java applications>javac Inheri06.java
Inheri06.java:24: error: call to super must be first statement in constructor
                super(); // calling super class constructor
                     ^
1 error*/