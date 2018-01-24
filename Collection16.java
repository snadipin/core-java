import java.util.*;

class Emp implements Comparable
{
	int eid;
	String ename;
	Emp(int eid , String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}

	public int compareTo(Object o)
	{
		Emp e=(Emp)o;

		return ename.compareTo(e.ename);

		// if u want decending order use below

		/* return -ename.compareTo(e.ename); */

		// if we are sorting by iteger data use below
		/*
		if (eid==e.eid)
		{
			return 0;
		}
		else if(eid>e.eid)
		{
			return 1;
		}
		else
		{
			return -1;	
		}
		*/
	}
}


class Collection16 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(05, " Nadipineni Saiharish");
		Emp e2 = new Emp(04, " Nadipineni Sairajesh");
		Emp e3 = new Emp(03, " Nadipineni Saisindhura");
		Emp e4 = new Emp(01, " Nadipineni Anjamma");
		Emp e5 = new Emp(02, " Nadipineni Srinivasarao");
		ArrayList <Emp> aa = new ArrayList<Emp>();
		aa.add(e4);
		aa.add(e5);

	   Collections.sort(aa);
		for(Emp aa:a1)
		{
		System.out.println("ArrayList a1 has ----->"+aa.eid+"--"+aa.ename);
		} 

	}
}
