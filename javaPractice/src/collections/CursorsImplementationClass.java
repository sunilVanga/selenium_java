package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsImplementationClass {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<Object>();
		Enumeration<Object> e=v.elements();
		System.out.println(e.getClass().getName());
		
		List<Object> l=new ArrayList<Object>();
		ListIterator<Object> lIterator=l.listIterator();
		System.out.println(lIterator.getClass().getName()         );
	}

}
