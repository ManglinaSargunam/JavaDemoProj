package construc;

public class childConstr implements parentConstr {
	public static void main(String[] args) {
		
		new childConstr();
		new thisConstr();
		childConstr obj1=new childConstr();
		obj1.replace();
	
	}

	public  childConstr() {
	}

	public  childConstr(int id) {
		this(2500.5f);
		System.out.println("id: "+id);
	}

	public  childConstr(float amt) {
		this(23.343d);
		System.out.println("amt: "+amt);
		
	}

	public  childConstr(String name) {
	
		System.out.println("product name: "+name);
		
	}

	public  childConstr(double tax) {
		this("kurtis");
		System.out.println("tax of product: "+tax);
		
	}


	@Override
	public void replace() {
		System.out.println("child replace");
		
	}

}
