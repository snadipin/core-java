class Parent
{ 
	Parent()
		{
		System.out.println(" parent - constructor"); //parent constructor
	}

	{
		System.out.println(" parent - instance"); //parent instance block
	}
	static {
		System.out.println(" parent - static"); //parent static block
	}
}
class Child extends Parent
{   
	Child(){
		// super(); compilier will generate this at the first line of child class constructor
		System.out.println(" child - constrctor"); // child constructor
     }

	{
		System.out.println(" child - instance"); // child instance block
     } 
	 
   	static {
		System.out.println(" child - static"); //child static block
	}

	public static void main(String[]args)
	{
		new Child();  
		//new Child();


	}
}


// try by creating one more object