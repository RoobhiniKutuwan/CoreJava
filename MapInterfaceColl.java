import java.util.*;
public class MapInterfaceColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm=new HashMap();
hm.put("179","Ruby");
hm.put("258","Ruhiy");

hm.put("358","Sagar");

hm.put("458","Jaya");

System.out.println(hm);
System.out.println(hm.get("2"));
Set keys=hm.keySet();
System.out.println(keys);
Iterator it=keys.iterator();
while(it.hasNext())
{
	String key=(String)it.next();
	System.out.println(hm.get(key));
	
	
	
	
}
System.out.println("Ruby".hashCode());
	}

}
