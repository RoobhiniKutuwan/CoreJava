import java.util.*;
class mobile1
{
	String mdel;
	int price;
	 public mobile1(String name,int p)
	{
		super();
		this.mdel=name;
		this.price=p;
	}
	 public String toString()
	 {
		 return this.mdel+" "+this.price;
	 }
	 public boolean equals(Object obj)
	 {
		 mobile1 mm=(mobile1)obj;
		 if(this.mdel.equals(mm.mdel)&& this.price==mm.price)
			 return true;
		 else
			 return false;
		 }
	 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.price*5;
	}
	 
}
public class SetInterfaceColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobile1 m1=new mobile1("nokia",4765);
		mobile1 m2=new mobile1("nokia",476);
HashSet hs=new HashSet();

hs.add(m1);
hs.add(m2);
System.out.println(hs);

	}

}
