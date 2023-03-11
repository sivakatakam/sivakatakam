import java.io.*;
class celsius
{
	public static void main(String args[])throws Exception
	{
		int c;
		float f;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		c=Integer.parseInt(br.readLine());
		f=(float)(c*1.8)+32;
		System.out.println(f);
	}
}