import java.util.*;

class Emp
{
	int eid;
	String ename;
	Emp(int eid, String ename)
	{
		this.eid=eid;
		this.ename=ename;

	}
}
class Collection12  
{
	public static void main(String[] args) 
	{

      ArrayList<Emp> a =new  ArrayList<Emp>();
	 a.add(new Emp(001,"Ryan-Booth"));
	 a.add(new Emp(002, "Alex-Parish"));
	 a.add(new Emp(003,"Simon-Asher"));
	 Emp e4 = new Emp(004,"Milanda-Shaw");
	 Emp e5 = new Emp(005,"Liam-O-Corner");
	  for(Emp e:a)
	{
		//  System.out.println(e.eid+"------>"+e.ename);

		}
	   
	   Iterator it = a.iterator();
	   while(it.hasNext())
		{
          Emp ee=(Emp)it.next();

		//  System.out.println(ee.eid+"------>"+ee.ename);

		}

	  ListIterator<Emp> itr = a.listIterator();

	  while (itr.hasNext())
	  {
		  Emp eee=itr.next();
		// System.out.println(eee.eid+"------>"+eee.ename);
	  }

	  while(itr.hasPrevious())
		{
		  Emp eeee=itr.previous();
		// System.out.println(eeee.eid+"------>"+eeee.ename);

		}

	while (itr.hasNext())
	{

        Emp eeeee= itr.next();
		if((eeeee.ename).equals("Simon-Asher"))
		{
			itr.remove();
		}
		if((eeeee.ename).equals("Ryan-Booth"))
		{
			itr.set(e5);
		}
	}

	for(Emp E:a)
		{
		//System.out.println(E.eid+"------>"+E.ename);

		}
	itr.add(e4);
		for(Emp E:a)
		{
		System.out.println(E.eid+"------>"+E.ename);

		}
   




   }
}



