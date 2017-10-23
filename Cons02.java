class Cons02 
{

    Cons02(int a) // 1- argument constructor
	{
	System.out.println("one-argument");
	}

	public static void main(String[] args) 
	{
		Cons02 c = new Cons02();
		Cons02 c1= new Cons02(10);
	}
}

/* E:\core java by ratan\java applications>javac Cons02.java
Cons02.java:11: error: constructor Cons02 in class Cons02 cannot be applied to given types;
                Cons02 c = new Cons02();
                           ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error */
