
// it is possible to create cons in abstract classs

abstract class Parent 
{

	Parent()
	{
      System.out.println("absstract class cons");
	}

}

class Child extends Parent
{
 Child (int a)
	{ 
	    // super();  
         System.out.println("child class cons");
	}
	public static void main(String[] args) 
	{
	   //Child c = new Child();
	   new Child(45);

	}
}
