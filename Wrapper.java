
public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=5;
		Integer ii=new Integer(k);
		System.out.println(ii.MAX_VALUE);
		Double dd=new Double(875.98);
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MAX_EXPONENT);
		String s1="23536";
		String s2="65768";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		int kkk=ii.intValue();
		System.out.println(kkk);
		int kk=878;
		Integer kkkk=new Integer(kk);
		System.out.println(Integer.toHexString(kkkk));
		System.out.println(Integer.toBinaryString(kkkk));
		System.out.println(Integer.toOctalString(kk));
		String company = "Deloitte works for 9 hours *";
		char arr[]=company.toCharArray();
		for(int i=0;i<company.length();i++)
		{
			char x=arr[i];
		if(Character.isDigit(x))
		System.out.println(x+" is a digit");
		else if(Character.isLetter(x))
		System.out.println(x+ " is a letter");
		else if(Character.isWhitespace(x))
		System.out.println(x+ " is a whitespace");
		else
			System.out.println(x+ " is a Special Character");
		
		
		}
		
	}

}
