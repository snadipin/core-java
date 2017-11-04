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
		super(); // calling super class constructor
		System.out.println("01-argu-----child---constructor");

	}

	public static void main(String[] args) 
	{

		new Child();
		
	}

}

/* to repergent child class construcotr this and parent  class super */

