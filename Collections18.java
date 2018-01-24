import java.util.*;
class Emp
{
	int eid;
	String ename;
	Emp(int eid , String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}

}

class EidComp implements Comparator 
{
	public int compare(Object o1 , Object o2)
	{
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;

		if (e1.eid==e2.eid)
		{
			return 0;
		}
		else if (e1.eid>e2.eid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

class EnameComp implements Comparator
{
	public int compare(Object o1 , Object o2)
	{
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;

		return e1.ename.compareTo(e2.ename);

	}
}

class Collections18
{
	public static void main(String [] args)
	{
		ArrayList<Emp> aa = new ArrayList<Emp> ();
		aa.add(new Emp(111,"harish"));
		aa.add(new Emp(184,"rajesh"));
		aa.add(new Emp(456,"AAAAA"));


		Iterator<Emp> i = aa.iterator();
        while (i.hasNext())
        {
			Emp r =i.next();
			System.out.println(r.eid + "----------"+r.ename);

        }
		Collections.sort(aa, new EidComp());
		Iterator<Emp> i = aa.iterator();
        while (i.hasNext())
        {
			Emp r =i.next();
			System.out.println(r.eid + "----------"+r.ename);

        }
	}
}
