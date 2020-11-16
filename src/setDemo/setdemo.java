package setDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setdemo {

	public static void main(String[] args) {
		
		Set s=new HashSet<>();
		s.add(123);
		s.add("mang");
		s.add('g');
		s.add(123);
		s.add("mang");
		
		System.out.println("set:    "+s);
		ArrayList k=new ArrayList(s);
		for(Object y:k) {
			System.out.println("index of:  "+k.indexOf(y)+",   value:  "+y);
		}
		
		
		HashMap<Integer, String> m=new HashMap<Integer, String>();
		m.put(0,"mang");
		m.put(1, "lina");
		m.put(2, "Manglina");
		m.put(3, "felix");
		m.put(4, "blesson");
		System.out.println("map:   "+m);
		for(int i=0;i<m.size();i++) {
			System.out.println(m.get(i));
		}
		System.out.println("map finding index 1:"+m.get(1));
		System.out.println("map finding index 2:"+m.get(2));
		
		System.out.println("******************************");
		
		setdemo s1=new setdemo();
		System.out.println(s1.list());
		ArrayList s2=s1.list();
		int size=s2.size();
		for(int i=0;i<s2.size();i++) {
			System.out.println("a:   "+s2.get(i));
			
			if(i<s2.size()-1) {
				
				System.out.println("b:    "+s2.get(i+1));
			}
				if(i<s2.size()-1) {
				i++;}
				else {
					break;
				}
		
		} 
			}
		
		
	
	public ArrayList list() {
		ArrayList a=new ArrayList();
		a.add(123);
		a.add("mang");
		a.add('l');
		a.add(123);
		a.add("lina");
		a.add("gl");
		a.add("sf");
		for(Object x:a) {
			System.out.println(x);
			
		}
		System.out.println("list of 1 index value:"+a.get(1));
		return a;
		
		
	}
	
}
