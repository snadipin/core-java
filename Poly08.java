

/* very important 
  
  if class declared as a final then the variables and methods  inside the class  are final or not?? ans: not for variables and yes for methods*/




final class Parent 
{ 
	
	
	void m1()   // methods are by default final
	{
      System.out.println("HELLO WORLD~");
	}
	public static void main(String[] args) 
	{  
		 int a=20; 
	  a=a+200;   // variables are not final 
		Parent p = new Parent();
		p.m1(); 
        System.out.println(a);
		
	}
}


/* final class methods are by default  final reason : if not final we can overide it and class child can be created */
