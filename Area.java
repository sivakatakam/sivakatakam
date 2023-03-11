import java.io.*;
class Area
{
	public static void main(String args[])throws Exception
	{
		int n,s,l,b;
		double a=0;
		System.out.println("If you want to find area of square then enter 1, or if you want to find area of circle the nenter 2, or if you want to find area of rectangle then enter 3");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		if(n==1)
		{
			System.out.println("Enter the length of side");
			s=Integer.parseInt(br.readLine());
			a=s*s;
		}
		else if(n==2)
		{
			System.out.println("Enter the lenght of radius");
			s=Integer.parseInt(br.readLine());
			l=s*s;
			a=3.14*l;
		}
		else if(n==3)
		{
			System.out.println("Enter the lenghth and breadth of rectangle");
			l=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
			a=l*b;
		}
		else
		System.out.println("Enter the correct input");
		System.out.println("Area = "+a);
	}
}