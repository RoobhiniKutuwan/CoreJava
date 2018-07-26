
public class stringD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x=args[0];
		int count=0;
		for(int i=0;i<x.length();i++)
			
			if(x.charAt(i)=='c'||x.charAt(i)=='C')
			
			count++;

		System.out.println(count);
	}

}
