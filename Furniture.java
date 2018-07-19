class cot
	{
		double price;
		public double CalculateDiscount(cot c)
		{
			return c.price*0.1;
		}
	}
	class table
	{
		double price;
		public double CalculateDiscount(table t)
		{
			return t.price*0.2;
		}
		
	}
	class dining
	{
		double price;
		public double CalculateDiscount(dining d)
		{
			return d.price*0.15;
		}
		
	}
	public class Furniture{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table T=new table();
		dining D= new dining();
		cot C=new cot();
C.price=786564.09;
T.price=788564.09;
D.price=7867864.09;
double CD=C.CalculateDiscount(C);
double TD=T.CalculateDiscount(T);
double DD=D.CalculateDiscount(D);
System.out.println(CD);
System.out.println(TD);
System.out.println(DD
		);
	}

}
