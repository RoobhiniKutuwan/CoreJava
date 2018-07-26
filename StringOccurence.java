
public class StringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="sanjay";
int l=name.length();
int x=name.indexOf('a');
for(int i=0;i<=l;i++)
{
	
			System.out.println(x);
			x++;
			x=name.indexOf('a',x);
	if(x==-1)
		break;
	
	
}
StringBuffer nm=new StringBuffer("Deloitte");
nm.append(" Banglore");
System.out.println(nm);
System.out.println(nm.insert(0, " city "));
StringBuffer rev=new StringBuffer();
for(int i=nm.length()-1;i>=0;i--)
{
	rev=rev.append(nm.charAt(i));
}
System.out.println(rev);
	}

}
