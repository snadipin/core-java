
/* instnace and local variables having same */

class Method7 
{
	int a =100; // instance variables
	int b =200;

	void add(int a,int b) // instance method : a,b are local variables
	{
    	System.out.println(a+b); // local variables directly calling   |
	    System.out.println(a+b); // instance  area so directly calling | BUT pirority goes to local variables (a,b) only
	}
	public static void main(String[] args) 
	{
		Method7 m=new Method7();
		m.add(20,50); // static area : so calling instance method using reference object 'm'
	
	}
}
