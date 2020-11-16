package strg;

public class strg {
	String s;
	String s1;
	
	public static void main(String[] args) {
		strg obj=new strg("puppy","kitty");
		obj.s();
				
		String n="Manglina";
		String n1="Mangala";
		String n2=n.concat(n1);
		System.out.println(n2);
		String n3=n.substring(4);
		System.out.println(n3);
		
	}
	
	private void s() {
		System.out.println(s);
		System.out.println(s1);
	}

	public strg(String s, String s1) {
		this.s=s;
		this.s1=s1;
	}
	
	

}
