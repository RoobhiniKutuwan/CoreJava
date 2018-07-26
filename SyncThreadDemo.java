class Greeting
{ String name;
	public synchronized void say(String name)
	{
		this.name=name;
		System.out.print("!");
		System.out.print(name);
		System.out.print("!");
	}
}
class GreetingThread extends Thread
{
	String name;
	Greeting greeting;
	GreetingThread(String name,Greeting greeting)
	{
		this .name=name;
		this.greeting=greeting;
	}
	public void run() {
		greeting.say(this.name);
	}
}
public class SyncThreadDemo {

	public static void main(String[] args) {
		
Greeting g=new Greeting();
//g.say("Ruby");
GreetingThread T2=new GreetingThread("ruby",g);

GreetingThread T1=new GreetingThread("peter",g);
T2.start();

T1.start();

	}

}
