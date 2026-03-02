class MixedOp
{
	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		int c=15;
		int d = a/2;//5
		boolean e = c%5==c/5;//false
		boolean f = b==c-10;//true
		boolean g = !(a!=b || a==c);//false
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	    System.out.println(g);
	
	}
}