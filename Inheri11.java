class Parent 
{
	Parent()
	{   
		// here also super(); is generated by compiler , in this case object case 0 -argumnt cons is excuted
		System.out.println(" parent");
	}

}

class Child extends Parent 
{
	Child()
	{
		// super(); generated by compiler
		System.out.println("0-argu-----child---constructor");

	}

    Child(int a)
	{
		// super(); generated by compiler 
		System.out.println("1-argu-----child---constructor");

	}
	

	public static void main(String[] args) 
	{

		new Child();
		new Child(10);
	}

}