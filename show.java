class declare
{
	int x;
	static int y;
	static void show()
		{
			System.out.println("Inside the Method");
		}
	public static void main(String s[])
	{
		int i=10;
		System.out.println(i);
		declare obj=new declare();
		System.out.println(obj.x);
		System.out.println(y);
		show();
	}
}