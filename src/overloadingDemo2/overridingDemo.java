package overloadingDemo2;

public class overridingDemo extends overlodingDemo implements companyDetails {
	
	public void employee2(int id,String name1, double salary, float loan) {
		System.out.println("id:"+id);
		System.out.println( "employee's name:"+name1);
		System.out.println("salary:"+ salary);
		System.out.println("loan percentage:"+ loan);
	}

	public static void main(String[] args) {
		overridingDemo obj2=new overridingDemo();
		System.out.println("Company Name:");
		obj2.companyName();
		System.out.println("Company's Address:");
		obj2.companyAddress();
		obj2.overlodingDemo(1);
		obj2.overlodingDemo("Manglina");
		obj2.overlodingDemo(60000d, 3.2f);
		obj2.employee2(2, "lina", 70000, 3.5f);
	
		
		overlodingDemo obj3=new overlodingDemo();
		obj3.overlodingDemo(3);
		obj3.overlodingDemo("Mangala");
		obj3.overlodingDemo(65000,3.4f);
		
		overlodingDemo obj4=new overridingDemo();
		obj4.overlodingDemo(4);
		obj4.overlodingDemo("Devi");
		obj4.overlodingDemo(67000, 3.3f);
		
		//overridingDemo obj5=new overlodingDemo();
		
	}

	public void companyName() {
		System.out.println("	Greens");
		
	}

	public void companyAddress() {
		System.out.println("	porur");
		
	}
}
