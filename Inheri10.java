class Parent 
{
	Parent()
	{
		System.out.println(" parent");
	}

}

class Child extends Parent 
{
	Child()
	{
		
		System.out.println("0-argu-----child---constructor");

	}

	

	public static void main(String[] args) 
	{

		new Child();
		
	}

}