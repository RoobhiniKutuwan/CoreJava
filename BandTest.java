
public class BandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Band B1=new Band();
Band B2=new Band();
String S[]= {"anu","vicky"};
String G[]= {"anita","vikas"};
String S1[]= {"anu","vicky","isha"};
String G1[]= {"anita","vikas","Anuj"};
B1.setBand("Rock", S, G,"Neha", "Arun");
B1.print();
B2.setBand("Rosh", S1, G1,"Neha", "Arun");
B2.print();


B1.count();
B2.count();
	}

}
