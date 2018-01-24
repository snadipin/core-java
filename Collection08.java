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
class Student
{
	int sid;
	String sname;
	Student(int sid , String sname)
	{
		this.sid = sid;
		this.sname = sname;
	}
}
class Collection8
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(01, " Nadipineni Saiharish");
		Emp e2 = new Emp(02, " Nadipineni Sairajesh");
		Emp e3 = new Emp(03, " Nadipineni Saisindhura");
		Student s= new Student(01,"Vanja Akhil");
		ArrayList<Emp> al = new ArrayList<Emp> (); //using generics : used to provide type safety for collections
		al.add(e1);
		al.add(e2);
		al.add(e3);
		for( Emp ee:al)
		{
		System.out.println(ee.eid+"-->"+ee.ename);
		}
		// 2 nd approach
		Emp eeeee = al.get(2);
		System.out.println(eeeee.eid+"-------------"+eeeee.ename);
	}
}
