class Parent
{

	{
		System.out.println(" parent - instance"); //parent instance block
	}
}
class Child extends Parent
{

	{
		System.out.println(" child - instance"); // child instance block
     }    
	public static void main(String[]args)
	{
		new Child();
		new Child(); // two times instance 	blocks will excute


	}
}