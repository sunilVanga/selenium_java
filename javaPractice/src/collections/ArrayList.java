package collections;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
	public static void main(String[] args) {
	java.util.ArrayList<Object> l=new java.util.ArrayList<>();
	l.add("s");
	l.add("u");
	
	l.add("n");
	l.add(3, "i");
	l.add(4, "l");
	
	String s1="kumar";
	l.add(s1);
	System.out.println(l);
	/*Iterator iterator=l.iterator();
	while(iterator.hasNext()) {
		String s=(String) iterator.next();
		System.out.println(s);
	}*/
		
	}

}
