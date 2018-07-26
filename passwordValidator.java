
public class passwordValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pw="Ruby@123";
		int uc=0,d=0,s=0,w=0,l=0;
		
		if(pw.length()>5 && pw.length()<11)
		{
		char arr[]=pw.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char x=arr[i];
		if(Character.isDigit(x)==true)
		    uc++;
		else if (Character.isLowerCase(x)==true)
			l++;
		else if (Character.isUpperCase(x)==true)
			d++;
		else if(Character.isWhitespace(x)==false)
			w++;
		else 
			s++;
		}
		}
		if (uc>0&&d>0&&s>0&&w==0&&l>0)
            System.out.println("Password is valid");
		else
			System.out.println("Password is invalid,length not valid or all the conditions are not satisfied");
		
		
		}

}

