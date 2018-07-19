
public class Employee {
private String name;
private int empid;
private double salary; static String companynm="Deloitte";
Employee(int eid,String nm,double sal){
	this.empid=eid;
	this.name=nm;
	this.salary=sal;
}
public static String getcompanynm()
{
	//
	return companynm;
	
}

public double calculateBonus()
{
	double bonus =0.0;
	if(this.salary<=5000)
		bonus=this.salary*0.2;
	else bonus=this.salary*0.1;
	
	return bonus;
}
}
