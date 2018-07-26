class NextThread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(char c='a';c<'e';c++)
		{
			System.out.println(c);
		}
	}
}
class NumberThread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	for(int i=2;i<11;i++)
	{
		System.out.println(i);
	}
	}
}
class NumberThread1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	for(int i=15;i<21;i++)
	{
		System.out.println(i);
	}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NumberThread NT=new NumberThread();
NumberThread1 NT2=new NumberThread1();
NextThread NT1=new NextThread();
NT.setName("NumberThread");
NT1.setName("NextThread");
NT.start();
NT2.start();
NT1.start();
	}

}
