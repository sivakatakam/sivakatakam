import java.io.*;
class Netsalary
{
	public static void main(String args[])throws Exception
	{
		float ns,gs,pf,it,pt;
		System.out.println("Enter the values of Gross Salary, Provident Fund, Professional Tax, Income tax respectively");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		gs=Float.parseFloat(br.readLine());
		pf=Float.parseFloat(br.readLine());
		pt=Float.parseFloat(br.readLine());
		it=Float.parseFloat(br.readLine());
		ns=gs-(pf+pt+it);
		System.out.println(ns);
	}
}