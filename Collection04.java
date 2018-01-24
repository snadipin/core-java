     

										//  BASIC OPERATIONS 


import java.util.*;

class Collection04 
{
	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		// adding data
		a.add(10);
		a.add("harish");
		a.add(10.9);
		a.add("rajesh");
		System.out.println(a);  // to see output

        System.out.println("size"+"---->"+a.size()); // to see size of any array list

		a.add("gopi");// to add new object | it will add to last index

		System.out.println(a); // to see updated arraylist

		a.add(0,"hai");// to add to the first position

		System.out.println(a); // to see updated arraylist

		a.remove(0);//int ---> index based and it will remove the first index

		System.out.println(a); // to see updated arraylist

		a.remove("gopi");// object based it will remove object

		System.out.println(a); // to see updated arraylist

		System.out.println(a.contains("harish")); // to see wheather the array list contain the harish or not
		System.out.println(a.isEmpty()); // to see wheather arraylist is empty is or not
		a.clear(); // to clear entire arraylist
		System.out.println(a);
		System.out.println("size"+"---->"+a.size()); // to see size of any array list








	}
}
