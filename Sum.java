
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("You passed..." + args.length + "Arguments");
		int sum=0;
		
		for(int i=0;i<3;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
			
		}
		System.out.println("Sum is " + sum);
	}

}
