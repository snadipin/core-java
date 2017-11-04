


// it is posibble to declare the insatnce and static blocks in the abstarct class  please do the comment code late getting error






abstract class Parent 
{
	{
      System.out.println("instance blcok");
	}
    
	static{
      System.out.println("static blcok");
	}

	/* Parent(int a)
	{
        System.out.println("cons");
	} */

}

class Child extends Parent
{

	public static void main(String[] args) 
	{
		new Child();
		// new Parent(20);
	}
}
