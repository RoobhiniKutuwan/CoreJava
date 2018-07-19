

	class A
	{
		int a=50;
	}

	class B extends A
	{
		int b=150;
		int a=5;
	}

	class C extends B
	{
		int c=590;
	}
	public class InheritenceMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c1=new C();
System.out.println(c1.a);
System.out.println(((A)c1).a);
	}

}
