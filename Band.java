
public class Band {
String name;
String Singers[];
String Guitarist[];
String Drummer;
String key;
 public void setBand(String nm,String[] sing,String[] guit,String Drum,String keyp)
 {
	 this.name=nm;
	 this.Singers=sing;
	 this.Guitarist=guit;
	 this.Drummer=Drum;
	 this.key=keyp;
 }
 public void print()
 {
	 System.out.println(name);
	 System.out.println(Singers);
	 System.out.println(Guitarist);
	 System.out.println(Drummer);
	 System.out.println(key);
 }
 public int count()
 {
 	return (2+Singers.length+Guitarist.length);
 	}
}

