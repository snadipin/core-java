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
class Collection2 
{
	public static void main(String[] args) 
	{
		Emp e = new Emp(01, " lanja* HARISH");
		Student s= new Student(01,"Vanja Akhil");
		ArrayList al = new ArrayList();
		al.add(e);
		al.add(s);
		al.add(10);
		al.add(10.9);
		al.add('s');
		al.add("ratan");
		al.add(null);
		System.out.println(al);

		for(Object o:al)
		{
			if(o instanceof Emp)
			{  
				Emp ee = (Emp)o;
                System.out.println(ee.eid+"-----------------"+ee.ename);
			}
			else if(o instanceof Student)
			{
				Student ss =(Student)o;
				System.out.println(ss.sid+"-------------------"+ss.sname);
			}
			else
			{
				System.out.println(o);
			}
		}
	}
}
	