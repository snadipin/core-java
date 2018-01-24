
/*
E:\core java by ratan\java applications>javap java.util.TreeSet
Compiled from "TreeSet.java"
public class java.util.TreeSet<E> extends java.util.AbstractSet<E> implements java.util.NavigableSet<E>, java.lang.Cloneable, java.io.Serializable {
  java.util.TreeSet(java.util.NavigableMap<E, java.lang.Object>);
  public java.util.TreeSet();
  public java.util.TreeSet(java.util.Comparator<? super E>); ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``
  public java.util.TreeSet(java.util.Collection<? extends E>);
  public java.util.TreeSet(java.util.SortedSet<E>);*/



import java.util.*;
class Emp
{
	int eid;
	String ename;
	long ephone;
	Emp(int eid,String ename,int ephone)
	{
		this.eid=eid;
		this.ename=ename;
		this.ephone=ephone;
	}
}

class ename implements Comparator<Emp>
{
	public int compare(Emp e1,Emp e2)
	{
		return (e1.ename).compareTo(e2.ename);
	}
}
class eid implements Comparator<Emp>
{
	public int compare(Emp e1, Emp e2)
	{
		if (e1.eid==e2.eid)
		{
			return 0;
		
		}
		else if(e1.eid>e2.eid)
		{ 
			return 1;
		}

	    else
		{
			return -1;
		}
	}
}

class ephone implements Comparator<Emp>
{
	public int compare(Emp e1, Emp e2)
	{
		if (e1.ephone==e2.ephone)
		{
			return 0;
		
		}
		else if(e1.ephone>e2.ephone)
		{ 
			return 1;
		}

	    else
		{
			return -1;
		}
	}
}

class Collections23
{
	public static void main(String[] args) 
	{
		TreeSet<Emp> t = new TreeSet<Emp>(new ephone());
		//TreeSet<Emp> t = new TreeSet<Emp>( );
         t.add(new Emp(01,"harish",2145690));
		 t.add(new Emp(02,"rajesh",2564845));
		 t.add(new Emp(03,"jarish",5862145));

		 for (Emp tt:t )
		 {
			 	System.out.println(tt.eid+"-----"+tt.ename+"--------"+tt.ephone);
		 }
	
	}
}

