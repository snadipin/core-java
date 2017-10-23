class Cons06 
{
	Cons06()
	{
		
		System.out.println("0-argument");
		this(10);
	}
	Cons06(int a , int b)
	{
		System.out.println("2-argument");
	}
	public static void main(String[] args) 
	{
		Cons06 c = new Cons06();
	}
}

/*E:\core java by ratan\java applications>javac Cons06.java
Cons06.java:7: error: call to this must be first statement in constructor
                this(10);
                    ^
1 error 


*/
