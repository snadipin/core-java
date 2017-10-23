class Method6 
{
	int a =100; // instance variables
	int b =200;

	void add(int x,int y) // instance method : x,y are local variables
	{
    	System.out.println(x+y); // local variables directly calling 
	    System.out.println(a+b); // instance  area so directly calling
	}
	public static void main(String[] args) 
	{
		Method6 m=new Method6();
		m.add(20,50); // static area : so calling instance method using reference object 'm'
	
	}
}
