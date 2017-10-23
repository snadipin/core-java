class Cons05 
{
	Cons05()
	{
		this(10);
		System.out.println("0-argument");
	}
	Cons05(int a)
	{
		this(10,20);
		System.out.println("1-argument ");
	}
	Cons05(int a , int b)
	{
		System.out.println("2-argument");
	}
	public static void main(String[] args) 
	{
		Cons05 c = new Cons05();
	}
}
