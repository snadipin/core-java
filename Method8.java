
/* *************THIS - KEYWORD***************instnace and local variables having same */

class Method8 
{
	int a =100; // instance variables
	int b =200;

	void add(int a,int b) // instance method : a,b are local variables
	{
    	System.out.println(a+b); // local variables directly calling   |
	    System.out.println(this.a+this.b); // instance  area so directly calling | BUT pirority goes to local variables (a,b) only so to repergent instance variables use this key word
	}
	public static void main(String[] args) 
	{
		Method8 m=new Method8();
		m.add(20,50); // static area : so calling instance method using reference object 'm'
	
	}
}