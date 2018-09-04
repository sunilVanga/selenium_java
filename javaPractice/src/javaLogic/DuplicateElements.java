package javaLogic;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		String[] courses= {"java","selenium","java","appium","ruby","appium"};
		int length=courses.length;
		System.out.println(length);
	/*	for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(courses[i]==courses[j]) {
					System.out.println(courses[i]);
				}
			}
		}*/
		
		
		Set<String> set=new HashSet<String>();
		for(String duplicates:courses) {
			if(set.add(duplicates)==false) {
				System.out.println(set);
			}
			}
		}
	}


