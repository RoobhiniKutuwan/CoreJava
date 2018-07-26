import java.util.*;
class Car1 implements Comparable
{
	
	String clr;
	double price;
	String model;
	Car1(String clr,double price,String model)
	{
		this.clr=clr;
		this.price=price;
		this.model=model;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Car1 cc=(Car1)o;
		int reValue=0;
		if(this.price==cc.price)
		reValue= 0;
		else if(this.price>cc.price)
			reValue= -1;
		else if(this.price>cc.price)
		reValue= 1;
		return reValue;
		
		//return this.brand.compareTo(cc.brand);  //--for comparing the brand
		//return this.clr.compareTo(cc.clr);      //--for comparing the color
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.clr+" "+this.price+" "+this.model;
	}
}
public class CollectionSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c1=new Car1("red",3875648.86,"Audi");
		Car1 c2=new Car1("white",3873548.86,"BMW");
		Car1 c3=new Car1("grey",3875648.86,"Ford");
ArrayList al=new ArrayList();
al.add(c1);
al.add(c2);
al.add(c3);
System.out.println(al);
Collections.sort(al);
System.out.println(al);


	}

}
