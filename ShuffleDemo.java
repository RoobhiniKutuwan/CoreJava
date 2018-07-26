import java.util.*;
class Car2 implements Comparable
{
	
	String clr;
	double price;
	String model;
	Car2(String clr,double price,String model)
	{
		this.clr=clr;
		this.price=price;
		this.model=model;
	}
}
public class ShuffleDemo {

	public static void main(String[] args) {
		
		
ArrayList al=new ArrayList();
al.add("A");
al.add("B");
al.add("C");
System.out.println(al);
Collections.reverse(al);
System.out.println(al);
Collections.rotate(al,1);
System.out.println(al);
	}

}
