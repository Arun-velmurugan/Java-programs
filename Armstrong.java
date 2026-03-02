class Armstrong
{
	public static void main(String[] args)
	{
		int a = 1320;
		int b = a%10;
		int c = a/10;
		int d = c%10;
		int e = c/10;
		int f = e%10;
		int g = e/10;
		int h = ((b*b*b*b)+(d*d*d*d)+(f*f*f*f)+(g*g*g*g));
		boolean result = a==h;
		System.out.println(result);
	}
}