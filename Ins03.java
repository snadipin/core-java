class Ins03 
{
	Ins03()
		{
		this('H');
		System.out.println("0 - argument constructor");	
	    }

	Ins03(char a)
	{
		System.out.println(" 1 - argumnet cvconstructor " );
	}
	{
		System.out.println("Instancre block");

	}
	public static void main(String[] args) 
	{
		new Ins03(); // name less object
	}

}