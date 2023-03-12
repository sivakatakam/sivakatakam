import java.io.*;
class Natural
{
	public static void main(String args[])throws Exception
	{
		int n,s;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		s=n*(n+1)/2;
		System.out.println(s);
	}
}