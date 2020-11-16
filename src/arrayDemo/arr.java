package arrayDemo;

public class arr {
	int x=10;
	public void array() {
	int[] y=new int[5];
	y[0]=1;
	y[1]=2;
	y[2]=3;
	y[3]=3;
	y[4]=4;
	
	System.out.println("print index of 4: "+y[4]);
	for(int k=0;k<y.length;k++) {
	System.out.println(y[k]);
	}
	//declaration, instantiation and initialization
	int a[]= {1,2,3,4,5};
	int b=a.length;
	
	System.out.println("index of 4: "+a[4]);
	for(int i=0;i<b;i++) {
		System.out.println(a[i]);
		
	}
	
String s[]= {"mang","lina","Manglina"};
for(int i=0;i<s.length;i++) {
	System.out.println(s[i]);
}
	
	
	}
	public static void main(String[] args) {
		arr obj1=new arr();
		obj1.array();
	}
	
	

}
