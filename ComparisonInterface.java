interface Comparison
{
	public void Compare(Object o1,Object o2);
}
class Employee1 implements Comparison
{
	String EmpName;
	double salary;
	Employee1(String en,double sal)
	{
		this.EmpName=en;
		this.salary=sal;
	}
	@Override
	public void Compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee1 e1=(Employee1)o1;
		Employee1 e2=(Employee1)o2;
		if(e1.salary>e2.salary)
			System.out.println(e1.EmpName + " is greater");
		else
			System.out.println(e2.EmpName + " is greater");
	}
}

class Apple implements Comparison
{
	String color;
	double price;
	Apple(String c,double p)
	{
		this.color=c;
		this.price=p;
	}
	@Override
	public void Compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Apple a1=(Apple)o1;
		Apple a2=(Apple)o2;
		if(a1.price>a2.price)
			System.out.println(a1.color +  " is greater");
		else
			System.out.println(a2.color +  " is greater");
	}
}
public class ComparisonInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 e1=new Employee1("Ruby",87647.98);
Employee1 e2=new Employee1("vatsala",67647.98);
Employee1 e3=new Employee1(null,0);
e3.Compare(e1, e2);

Apple a1=new Apple("Red",87647.98);
Apple a2=new Apple("green",67647.98);
Apple a3=new Apple(null,0);
a3.Compare(a1, a2);
	}

}
