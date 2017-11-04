class Sta02
{
static String name;
static int num;
static double sal;
static
	{
	name="Nadipineni Sai Harish";
	num= 9;
	sal= 7584593040.67;
	}
static void profile()
	{
	System.out.println("name		"+name);
	System.out.println("roll num	"+num);
	System.out.println("salary		"+ sal);
	}
	public static void main(String[] args) 
	{
	   Sta02 s = new Sta02();
		Sta02.profile();
	}
}
