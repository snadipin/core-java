class Sta01
{
	static 
	{
		System.out.println("static block A"); 
	}

	public static void main(String[] args) throws  ClassNotFoundException
	{
	    Class.forName("B");
		Class.forName("C");
	}
}

