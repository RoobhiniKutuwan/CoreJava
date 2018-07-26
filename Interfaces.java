interface TVRemote
{
	public boolean SO();
	public boolean CC();
	public boolean IV();
	public boolean DV();
}
class Sony implements TVRemote
{
	@Override
	public boolean SO() {
		// TODO Auto-generated method stub
		System.out.println("Sony TV Switches off");
		return true;
	}

	@Override
	public boolean CC() {
		// TODO Auto-generated method stub
		System.out.println("Sony TV changes channel");
		return true;
	}

	@Override
	public boolean IV() {
		// TODO Auto-generated method stub
		System.out.println("Sony TV increases volume");
		return true;
	}

	@Override
	public boolean DV() {
		// TODO Auto-generated method stub
		System.out.println("Sony decreases volume");
		return true;
	}
}
class Samsung implements TVRemote
{
	@Override
	public boolean SO() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV Switches off");
		return true;
	}

	@Override
	public boolean CC() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV changes channel");
		return true;
	}

	@Override
	public boolean IV() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV increases volume");
		return true;
	}

	@Override
	public boolean DV() {
		// TODO Auto-generated method stub
		System.out.println("Samsung decreases volume");
		return true;
	}
}
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Samsung s=new Samsung();
System.out.println(s.SO());
System.out.println(s.CC());
System.out.println(s.DV());
System.out.println(s.IV());
Sony s1=new Sony();
System.out.println(s1.SO());
System.out.println(s1.CC());
System.out.println(s1.DV());
System.out.println(s1.IV());
	}

}
