
public class Mobile {
String brandname;
double price;
String color;
int resolution;
public void makecall()
{
	System.out.println("Connecting the call");
	
}
public void sendatext()
{
	System.out.println("texting...");
}

}
class Mobilej
{
public static void main(String args[])
{
	Mobile m1=new Mobile();
	m1.makecall();
}
}