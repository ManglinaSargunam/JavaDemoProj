package superKey;

public class subclass extends base {
	int x=50;
	String password="Mang";
	public void name() {
		super.name();
		super.password();
		System.out.println("sub class:"+super.x);
	}
	public static void main(String[] args) {
		subclass s=new subclass();
		s.name();
		// base obj1=new base();
		// obj1.name();
		
	}
	
}
