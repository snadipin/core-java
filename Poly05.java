
// rule -3 

// rule -- it is possible to change the return type at class level

// co -varient return type concept



class Animal
{
}
class Dog extends Animal
{
}

class  Parent
{

   Animal m1()
	{
	   System.out.println(" parent class ");

	      return new Animal();

	}
}

class  Child extends Parent
{

   Dog m1()
	{
	   System.out.println(" Child class ");
	   return new Dog();
	}
	   

	public static void main(String[] args) 
	{

		new Child().m1();
		
	}
}
