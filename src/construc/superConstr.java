package construc;

public class superConstr extends thisConstr {
	
	public void display() {
		System.out.println("super constructor");
		super.display();
	}
	
	
	public void helper() {
		//display();
		super.display();
	}
	public superConstr() {
		super(105);
	}
	public static void main(String[] args) {
		
	superConstr s=	new superConstr();
		// new thisConstr();
   // s.display();
    
    s.helper();
	}
}
