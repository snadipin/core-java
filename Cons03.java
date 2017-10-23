class Cons03 
{
	int eid;
	String ename;
	float esal;

	void disp()
	{
      System.out.println("empid -----> " + eid);
	  System.out.println("salary -----> "+ esal);
	  System.out.println("name -----> " + ename);
	  }

	 Cons03(int eid,float esal,String ename)
	{
		 this.eid=eid;
		 this.esal=esal;
		 this.ename=ename;
	}

	public static void main(String[] args) 
	{
		Cons03 c = new Cons03(2,10000.45f,"harish");
		c.disp();
	}
}


/* purpuse of construtors :

one -- used to write business logic which are excuted during object creation ---------25% usage of constructors 
second -- used to intialize the instacte variables during object creation ----------75% usage of constructors  */
