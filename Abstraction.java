abstract class Person6
{
	public boolean DHB()
	{
		System.out.println("Every Person Breathes");
return true;
}
	public boolean DHS()
	{
		System.out.println("Every Person Sleeps");
return true;
}
	public abstract boolean DHD(); 
}
abstract class Employee6 extends Person6{
	public abstract boolean DHD(); 
}
class Driver1 extends Employee6
{

	@Override
	public boolean DHD() {
		// TODO Auto-generated method stub
		System.out.println("Every Driver Drives a Car");
		return true;
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Driver1 D1=new Driver1();
System.out.println("Breathing?" + D1.DHB());
System.out.println("Sleeping?" + D1.DHS());
System.out.println("Driving?" + D1.DHD
		
		());
	}

}
