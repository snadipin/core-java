class Poly01 
{
	// Constructor overlaoding

	Poly01(int a)
	{
	  System.out.println(" Constructor overlaoding");
	  }
	Poly01(int a , int b)
	{
	  System.out.println(" Constructor overlaoding");
	  }
	 Poly01(char a)
	{
	  System.out.println(" Constructor overlaoding");
	  }
	public static void main(String[] args) 
	{
		new Poly01(10);
		new Poly01(10,20);
		new Poly01('A');
		
	}
}
