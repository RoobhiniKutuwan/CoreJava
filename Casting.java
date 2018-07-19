class employee
{
	int a=90;
	
}
class HR extends employee
{
	int b=890;
	
}
class Recruiter extends HR
{
	int a=7;
	int ab=76;
	
}
class financiar extends HR
{
	int a=7;
	int ab=76;
	
}
class Technical extends employee
{
	int b=890;
	
}
class java extends Technical
{
	int b=890;
	
}
class pm extends Technical
{
	int b=890;
	
}
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Technical T=new java();
HR h= new Recruiter();
employee e=new HR();
employee e1=new pm();
java j=new java();
if (T instanceof java)
	 j=(java)T;
System.out.println(T.a);
	}

}
