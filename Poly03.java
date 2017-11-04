
 // method overriding -- rule 01

 // rule 01 - parent class (overidden method) method signture and child class( overriding method) method signautres must be same



class Parent 
{

	void marriage() // overriden method
	{
      System.out.println("black girl");
	}

}
class Child extends Parent
{

	void marriage() // overriding method
	{
      System.out.println("white girl");
	}



	public static void main(String[] args) 
	{
		new Child().marriage();
		
	}
}
