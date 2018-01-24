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


class Collection06 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(05, " Nadipineni Saiharish");
		Emp e2 = new Emp(04, " Nadipineni Sairajesh");
		Emp e3 = new Emp(03, " Nadipineni Saisindhura");
		Emp e4 = new Emp(01, " Nadipineni Anjamma");
		Emp e5 = new Emp(02, " Nadipineni Srinivasarao");
		ArrayList <Emp> a1 = new ArrayList<Emp>();
		a1.add(e4);
		a1.add(e5);
		for(Emp aa:a1)
		{
		System.out.println("ArrayList a1 has ----->"+aa.eid+"--"+aa.ename);
		}
        ArrayList <Emp> a2 = new ArrayList<Emp>();
        a2.add(e1);
		a2.add(e2);
		a2.add(e3);

		for(Emp aa:a2)
		{
		System.out.println("ArrayList a2 has ----->"+aa.eid+"--"+aa.ename);
		}
		System.out.println("status ----->"+a2.contains(e1)); // checking a2 wheather contains e1  or not
		a2.addAll(a1); // adding all the objects of a1 to a2
		System.out.println("status ----->"+a2.containsAll(a1)); // checking all objects of a1 in a2 wheater exit or not
		for(Emp bb:a2)
		{
		System.out.println("ArrayList a2 has ----->"+bb.eid+"--"+bb.ename);
		}

		


		



	}
}
