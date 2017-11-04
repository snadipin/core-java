class Parent 
{
	void m1()
	{
		System.out.println("a");
	}
}
class Child extends Parent
{
	void m1()
	{
		System.out.println("b");
	}
	void m2()
	{
        System.out.println("am noraml");
	}

	public static void main(String[] args) 
	{
   Parent p = new Child();
   p.m1();    // compiler check mq in parent : aviable  ~~ runtime child object is created so checks in child class and excutes overridden method
  // p.m2();  // cannot access directly becoz compiler check in parent class m2 avialable or not no available

  Child c = (Child) p;  // type casting : converting parent reference to child
  c.m2();
		
	}
}
