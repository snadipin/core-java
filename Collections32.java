
import java.util.*;
class Emp
{
int eid;
String ename;
  Emp(int eid,String ename)
	{
	this.eid=eid;
	this.ename=ename;
	}

}
class Student
{
int sid;
String sname;
 Student(int sid,String sname)
	{
	this.sid=sid;
	this.sname=sname;
	}

}
class  Collections32
{
	public static void main(String[] args) 
	{
		HashMap<Emp,Student> h= new HashMap<Emp,Student>();
		h.put(new Emp(111,"hari") , new Student(01,"xxx"));
		//System.out.println(h);
		

		Set ss=h.entrySet();
		Iterator I=ss.iterator();
		while (I.hasNext())
		{
		   Map.Entry m =(Map.Entry)I.next();
		   Emp ee=(Emp) m.getKey();
		   Student se=(Student)m.getValue();

		   System.out.println(ee.eid+"--------"+ee.ename);
		   System.out.println(se.sid+"--------"+se.sname);

		

		}
	}
}

/*
E:\core java by ratan\java applications>javac Collections32.java

E:\core java by ratan\java applications>java   Collections32
111--------hari
1--------xxx

E:\core java by ratan\java applications>
*/