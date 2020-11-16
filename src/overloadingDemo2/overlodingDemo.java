package overloadingDemo2;

public class overlodingDemo {
	public void overlodingDemo() {
		System.out.println("This is Overloading");
	}
	
	public void overlodingDemo(String name) {
		System.out.println("Employee's Name:"+ name);
		
	}
	
	public void overlodingDemo(int x){
		
		System.out.println("id:"+ x);
	
}
	public void overlodingDemo(double d,float loan){
		System.out.println("salary:"+d);
		System.out.println("loan percentage:"+ loan);
		
	}
	
	public static void main(String[] args) {
		overlodingDemo obj1=new overlodingDemo();
		obj1.overlodingDemo();
		obj1.overlodingDemo(2);
		obj1.overlodingDemo("Manglina");
		obj1.overlodingDemo(60000d, 3.2f );
	}

}
