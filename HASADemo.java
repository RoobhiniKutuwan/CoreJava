class emp
{
	String name;
	int eid;
	double salary;
	Address ad;
	
	emp(String name,int eid,double salary,Address ad){
		this.name=name;
		this.eid=eid;
		this.salary=salary;
		this.ad=ad;
	}
	public void printempd()
	{
		System.out.println(this.name);
		System.out.println(this.eid);
		System.out.println(this.salary);
		ad.printadd();
	}
}

class Address{
	int hno;
	String strtname,bname,city;
	long pcode;
	
	Address(int hno,String strtname,String bname, String city,long pcode)
	{
		this.hno=hno;
		this.strtname=strtname;
		this.bname=bname;
		this.city=city;
		this.pcode=pcode;
	}
	public void printadd()
	{
		System.out.println(this.hno);
		System.out.println(this.strtname);
		System.out.println(this.bname);
		System.out.println(this.city);
		System.out.println(this.pcode);
	}
}
public class HASADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address ad=new Address(112,"Shambhavi","hingne","pune",411052);
emp e1=new emp("ruby",7654,873655.87,ad);
e1.printempd();
	}

}
