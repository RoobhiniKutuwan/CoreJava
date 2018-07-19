class Car {
String name;
double m;
double price;
boolean LT;
 Car(String n,double ml,double p,boolean l)
 {
	 this.name=n;
	 this.m=ml;
	 this.price=p;
	 this.LT=l;
 }
 public void print()
 {
	 System.out.println(name);
	 System.out.println(m);
	 System.out.println(price);
	 System.out.println(LT);
 }
 
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car a=new Car("alto",3.56,987436.09,true);
Car b=new Car("aliuhvg",32.56,687436.09,true);



a.print();
b.print();
String nm;
	 if(a.price>b.price)
	 nm="Aa";
	 else 
		 nm="Bb";
	System.out.println(nm +" "+ "is costliest");
	
	
}

	}

