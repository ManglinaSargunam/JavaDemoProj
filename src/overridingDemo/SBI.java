package overridingDemo;

public class SBI extends RBI implements ICICI {

	public void homeloan() {
		System.out.println("SBI home loan interset is 9%");
	}
	
	public void atm() {
		System.out.println("SBI withdraw amt per day in atm is 20000");
	}


	public void deposit() {
		System.out.println("SBI deposit amt");
	}

	@Override
	public void loan() {
		System.out.println("SBI loan amt 30lakhs");
		super.loan();
	}

	public static void main(String[] args) {
		SBI obj1=new SBI();//access all methods of parent &child
		System.out.println("child ref &child obj:"); 
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
		obj1.atm();
		obj1.homeloan();
		obj1.loan();
		obj1.deposit();
		obj1.creditcard();
		obj1.debitcard();
		
		System.out.println("***************************");
		
		
		RBI obj2=new RBI();//access  methods of parent 
		System.out.println("parent ref & parent obj:");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");		
		obj2.atm();
		obj2.homeloan();
		obj2.loan();
		obj2.creditcard();
		obj2.debitcard();
		//obj2.deposit(); //This not belongs to RBI class
		System.out.println("***************************");
		
		
		RBI obj3=new SBI();//access all methods of parent & not child class
		System.out.println("parent ref &child obj:");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
		obj3.atm();
		obj3.homeloan();
		obj3.loan();
		obj3.creditcard();
		obj3.debitcard();
		
		//obj3.deposit(); 
		System.out.println("***************************");
		
		
		/* child reference and parent obj is invalid
		SBI obj1=new RBI();
		obj1.atm();
		obj1.homeloan();
		obj1.loan();
		obj1.deposit();
		*/
		
	}

}
