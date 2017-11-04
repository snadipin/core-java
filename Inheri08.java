class Parent 
{
	// parent class default constructor is excuting

}

class Child extends Parent 
{
	Child()
	{
		super();// super class 0 -argument is calling but not avaialble compiler will generate this so no error ie; concusion of this example
		System.out.println("0-argu-----child---constructor");

	}

	

	public static void main(String[] args) 
	{

		new Child();
		
	}

}