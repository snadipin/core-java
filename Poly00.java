class Poly00 
{
	// method overlaoding

	void m1(int a)
	{
	  System.out.println(" method overloading");
	  }
	 void m1(int a , int b)
	{
	  System.out.println(" method overloading");
	  }
	 void m1(char a)
	{
	  System.out.println(" method overloading");
	  }
	public static void main(String[] args) 
	{
		Poly00 p = new Poly00();
		p.m1(10);
		p.m1(10,20);  // all these mapping is done during compile time so called compile time polymorphism
		p.m1('a');
	}
}
