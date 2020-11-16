package overridingDemo;

public class RBI implements ICICI {
	
	public void homeloan() {
		System.out.println("RBI home loan interset is 8%");
	}
	
	public void atm() {
		System.out.println("RBI withdraw amt per day in atm is 15000");
	}

	
	@Override
	public void loan() {
		System.out.println("RBI loan amt 25lks");
	}

	@Override
	public void debitcard() {
		System.out.println("RBI debitcard");
	}

	@Override
	public void creditcard() {
		System.out.println("RBI creditcard");
			
	}
}
