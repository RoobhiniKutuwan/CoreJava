interface SocialFeedReader
{
	 Message  PM();
	 
}
class Message 
{
	int MID;
	String MS;
	String MT;
	String MES;
	String Sender;
	
		public String getSender() {
		return Sender;
	}
	public void setSender(String sender) {
		Sender = sender;
	}
		// TODO Auto-generated method stub
		public int getMID() {
		return MID;
	}
	public void setMID(int mID) {
		MID = mID;
	}
	public String getMS() {
		return MS;
	}
	public void setMS(String mS) {
		MS = mS;
	}
	public String getMT() {
		return MT;
	}
	public void setMT(String mT) {
		MT = mT;
	}
	public String getMES() {
		return MES;
	}
	public void setMES(String mES) {
		MES = mES;
	}
		
		
	}
class Twitter implements SocialFeedReader
{
	public Message PM()
	{
		Message m1=new Message();
		m1.setMID(2);
		m1.setMS("fb");
		m1.setMT("image");
		m1.setMES("hbfdjhfh");
		m1.setSender("vatsala");
		return m1;
	}
}
class FB implements SocialFeedReader
{
	public Message PM()
	{
		Message m1=new Message();
		m1.setMID(1);
		m1.setMS("fygv");
		m1.setMT("text");
		m1.setMES("hknvsxvkyfyt");
		m1.setSender("Ruby");
		return m1;
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twitter tfr=new Twitter();
		FB ftr=new FB();
Message m1=tfr.PM();
Message m2=ftr.PM();
System.out.println(m1.getMID());
System.out.println(m1.getMS());
System.out.println(m1.getMT());
System.out.println(m1.getMES());
System.out.println(m1.getSender());
System.out.println("\n");
System.out.println(m2.getMID());
System.out.println(m2.getMS());
System.out.println(m2.getMT());
System.out.println(m2.getMES());
System.out.println(m2.getSender());
	}

}
