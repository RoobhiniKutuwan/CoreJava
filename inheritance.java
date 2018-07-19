class parent{
	public void m1()
	{System.out.println("hi");}
	
}
class child extends parent{
	public void m2() {}
	public void m3() {}

}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent p=new child();
p.m1();
	}

}
