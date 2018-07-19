
public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double m1,m2,m3,m4,m5;
		m1=75.08;
		m2=73.08;
		m3=70.78;
		m4=74.08;
		m5=68.08;
			
		if(m1>m2&&m1>m3&&m1>m4&&m1>m5)
		System.out.println("highest number" + m1);
		else if(m2>m1&&m2>m3&&m2>m4&&m4>m5)
			System.out.println("highest number" + m2);
		else if(m3>m2&&m3>m1&&m3>m4&&m3>m5)
			System.out.println("highest number" + m3);
		else if(m4>m2&&m4>m3&&m4>m1&&m4>m5)
			System.out.println("highest number" + m4);
		else if(m5>m2&&m5>m3&&m5>m4&&m5>m1)
			System.out.println("highest number" + m5);
	}

}
