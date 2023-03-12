import java.io.*;
class interest
{
	public static void main(String args[])throws Exception
	{
		int p,t,r;
		float i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		p=Integer.parseInt(br.readLine());
       	t=Integer.parseInt(br.readLine());
		r=Integer.parseInt(br.readLine());
		i=(float)(p*t*r)/100;
		System.out.println("Interest = "+i);
	}
}