import java.io.*;
class Heron
{
	public static void main(String args[])throws Exception
	{
		float a,b,c,s;
		double ar;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		s=(a+b+c)/2;
		ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area = "+ar);
	}
}