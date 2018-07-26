import java.util.*;


public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
//Employee1 e=new Employee1();
al.add("Ruby");
al.add("sagar");
al.add("ibin");
al.add("shourya");
al.add("savni");
al.add("irfac");
al.add(57);
al.add(5768);
al.add(7577);
System.out.println(al);
//al.add(e);
int ind =al.indexOf("ibin");
al.remove(ind);
al.add(ind,"Roobhini");
System.out.println(al);
	}

}
