class Product1
{
String Name;
double Price;
Product1(String Name,double Price)
{
	this.Price=Price;
	this.Name=Name;
}
}
public class ArrayofObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product1 p1=new Product1("Bat",234.6);
Product1 p2=new Product1("Laptop",2367.6);
Product1 p3=new Product1("TV",2346.6);
 Product1 arr[]={p1,p2,p3};
// arr[]={p1,p2,p3};
 for (int i=0;i<arr.length;i++)
 {
	 System.out.println(arr[i].Name);
     System.out.println(arr[i].Price);
	}
	}
}
