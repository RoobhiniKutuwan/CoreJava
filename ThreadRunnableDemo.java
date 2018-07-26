class Thread1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=2;i<11;i++)
		{
			System.out.print(i);
		}
	}
	
}
class Thread2 implements Runnable
{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char c='a';c<'e';c++)
		{
			System.out.print(c);
		}
	}
}
public class ThreadRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread Th=new Thread(new Thread1());
Thread Th1=new Thread(new Thread2());

Th.start();
Th1.start();

	}

}
