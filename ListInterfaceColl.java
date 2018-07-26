import java.util.*;
public class ListInterfaceColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll=new LinkedList();
ll.add("java");
ll.add("cpp");
ll.add("vb");
ll.add("hadoop");
System.out.println(ll);
Iterator i =ll.iterator();
while(i.hasNext())
System.out.println(i.next());
ListIterator Lt=ll.listIterator();
while(Lt.hasNext())
	System.out.println(Lt.next());
while(Lt.hasPrevious())
	System.out.println(Lt.previous());
	}

}
