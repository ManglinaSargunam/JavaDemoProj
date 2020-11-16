package exceptiondemo;

import java.io.IOException;

public class handlingExcep {
	public void div() {
		System.out.println("start of the program");
		try {
			int x[] =new int[5];
			x[7]=30;
		}

		catch(ArithmeticException e1) {
			System.out.println("Exception found"+e1.getMessage());
		}

		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bound exception:"+e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println("Exception occured"+e.getMessage());
		}
			
		
		System.out.println("end of the program");

	}
	public static void main(String[] args) {
		handlingExcep d=new handlingExcep();
		d.div();
			
	}

}
