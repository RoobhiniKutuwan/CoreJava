
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e=new Employee(101,"Ruby",5000.00);
double bonus=e.calculateBonus();
System.out.println(bonus);
System.out.println(Employee.getcompanynm());
System.out.println(e.getcompanynm());
Employee e1=new Employee(102,"Rubini",15000.00);
e1.companynm="ibm";
System.out.println(e1.getcompanynm());
System.out.println(e.getcompanynm());
	}

}
