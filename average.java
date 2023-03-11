import java.io.*;
class ave
{
	public static void main(String args[])throws Exception
	{
		int a,b,c,d,e,t;
		float ave;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
       	b=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
       	d=Integer.parseInt(br.readLine());
		e=Integer.parseInt(br.readLine());
		t=a+b+c+d+e;
		ave=t/5;
		System.out.println("Total = "+t+" Average = "+ave);
	}
}