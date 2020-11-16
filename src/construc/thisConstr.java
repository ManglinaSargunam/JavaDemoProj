package construc;

public class thisConstr {
	public void display() {
		System.out.println("this Constructor");
	}
	public  thisConstr() {
		
	
	}

	public  thisConstr(int id) {
		this(2500.5f);
		System.out.println("id: "+id);
	}

	public  thisConstr(float amt) {
		this(23.343d);
		System.out.println("amt: "+amt);
		
	}

	public  thisConstr(String name) {
	
		System.out.println("product name: "+name);
		
	}

	public  thisConstr(double tax) {
		this("kurtis");
		System.out.println("tax of product: "+tax);
		
	}

	public static void main(String[] args) {
		
		new thisConstr();
	
		
	}
}
