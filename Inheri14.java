class Parent
{ 
	Parent()
		{
		System.out.println(" parent - constructor"); //parent constructor
	}

	{
		System.out.println(" parent - instance"); //parent instance block
	}
}
class Child extends Parent
{   
	Child(){
		// super(); compilier will generate this at the first line of child class constructor
		System.out.println(" child - constrctor"); // child constructor
     }

	{
		System.out.println(" child - instance"); // child instance block
     }    
	public static void main(String[]args)
	{
		new Child();  


	}
}


/* steps

1 -- new Child (); object created , then compilier will genrate super(); at child constructor
2 -- then parent class starts excuting as instance fisrt instance block will excute then parent cons
3 -- then child class instance then child class instance

   E:\core java by ratan\java applications>javac Inheri14.java

E:\core java by ratan\java applications>java Child
 parent - instance
 parent - constructor
 child - instance
 child - constrctor

*/