abstract class Person{
	public abstract  boolean WTD();
	boolean DYS()
	{
		System.out.println("every person speaks");
		return true;
	}
}
	class Trainer extends Person{

		@Override
		public boolean WTD() {
			System.out.println("I am a Trainer");
			return true;
		}
	}

	class Doctor extends Person{

		@Override
		public boolean WTD() {
			System.out.println("I am a Doctor");
		
			// TODO Auto-generated method stub
			return true;
		}
	}
	class Pilot extends Person{

		@Override
		public boolean WTD() {
			System.out.println("I am a pilot");
		
			// TODO Auto-generated method stub
			return true;
		}
	}
		
		

public class PersonAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Trainer();
System.out.println(p.WTD());
System.out.println(p.DYS());
Person p1=new Doctor();
System.out.println(p1.WTD());
System.out.println(p1.DYS());
Person p2=new Pilot();
System.out.println(p2.WTD());
System.out.println(p2.DYS());
	}

}
