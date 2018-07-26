
public class EnumDemo {
enum Weekday {mon,tyue,wed,thur,fri,sat,sun};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Weekday[] w=Weekday.values();
for (Weekday w1:w)
	System.out.println(w1);
System.out.println(Weekday.tyue);
	}

}
