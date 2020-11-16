package superKey;

public class childc extends parentC {
		public childc() {
			System.out.println("Child default constructor: ");
		}
		
		public childc(String name) {
			super("mang",name);
			System.out.println("Child class parameterized constructor: "+name);
		}
		
		public static void main(String[] args) {
			//childc obj1=new childc("manglina");
			
			parentC obj2=new childc("mang");
			
		}
}
