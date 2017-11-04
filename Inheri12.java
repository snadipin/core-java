class Parent
{
	Parent()
	{
		System.out.println(" parent");
	}
}
class Child extends Parent
{

	/* this will happen (compilers does this)

	  child()
	{
		super();
     }    */
	public static void main(String[]args)
	{
		new Child();
	}
}