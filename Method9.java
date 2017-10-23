
/* *************THIS - KEYWORD*********** IS VALID TO DECLARE IN JAVA */

class Method9 
{
	int a =100; // instance variables
	int b =200;

	static void add(int a,int b) // static method
	{
    	System.out.println(a+b); // local variables directly calling   |
	    System.out.println(this.a+this.b); //not valid it will araise error
	}
	public static void main(String[] args) 
	{
		Method9 m=new Method9();
		m.add(20,50); // static area : so calling instance method using reference object 'm'
	
	}
}

/*E:\core java by ratan\java applications>javac Method9.java
Method9.java:12: error: non-static variable this cannot be referenced from a static context
            System.out.println(this.a+this.b); //not valid it will araise error
                               ^
Method9.java:12: error: non-static variable this cannot be referenced from a static context
            System.out.println(this.a+this.b); //not valid it will araise error
                                      ^
2 errors*/