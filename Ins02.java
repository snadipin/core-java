class Ins02 
{
	Ins02()
		{
		System.out.println("0 - argument constructor");	
	    }


	Ins02(char a)
	{
		System.out.println(" 1 - argumnet cvconstructor " );
	}
	Ins02( int a , boolean b)
	{
		System.out.println(" 2 - argument constructor ");
	}


	{
		System.out.println(" one ---- Instancre block ");

	}

    	{
		System.out.println("two -----Instancre block");

	}
	public static void main(String[] args) 
	{
		new Ins02(); // name less object
		new Ins02('h');
		new Ins02(2,true);
	}
}
/* many instance blocks can be declared and excution will from top to bottom */