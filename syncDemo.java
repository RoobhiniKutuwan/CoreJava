class Restaurant
{
	public synchronized void takeFood(String name)
	{
		System.out.println("only one person is permitted to have food here"+" "+name);
	}
}
class intermediate extends Thread
{
	String name;
	Restaurant R;
	intermediate(String name,Restaurant R)
	{
		this .name=name;
		this.R=R;
	}
	public void run() {
		R.takeFood(this.name);
	}
}
public class syncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Restaurant R1=new Restaurant();
intermediate i=new intermediate("ruby",R1);
intermediate i2=new intermediate("rohan",R1);
intermediate i3=new intermediate("peter",R1);
i.start();
i2.start();
i3.start();
}

}
