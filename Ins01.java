class Ins01 
{
	Ins01()
		{
		System.out.println("0 - argument constructor");	
	    }

	Ins01(char a)
	{
		System.out.println(" 1 - argumnet cvconstructor " );
	}
	Ins01( int a , boolean b)
	{
		System.out.println(" 2 - argument constructor ");
	}
	{
		System.out.println("Instancre block");

	}
	public static void main(String[] args) 
	{
		new Ins01(); // name less object
		new Ins01('h');
		new Ins01(2,true);
	}
}

/* KEY-POINTS 


 1) Both, construcotrs and instance blocks, are excuted during object creation only
     but , instance first followed by constructor excution.

 2) instance block excution depends on objection creation and specific to object creation ie; if 10 objects 10 times instance block is eccuted , constructor also .


 */