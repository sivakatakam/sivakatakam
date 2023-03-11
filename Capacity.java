import java.io.*;
class Capacity
{
	public static void main(String args[])throws Exception
	{
		int t,s,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(br.readLine());
		s=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=2*t*s*b*512;
		System.out.println("Capacity = "+c);
	}
}