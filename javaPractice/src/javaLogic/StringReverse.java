package javaLogic;

public class StringReverse {

	public static void main(String[] args) {
//		String s="sunil";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--) {
//		rev=	rev+s.charAt(i);
//		
//		}
//		System.out.println(rev);
		
		String s="selenium";
		String rev="";
		char[] ch=s.toCharArray();
	int length=	ch.length;
	for(int i=0;i<length;i++) {
		 rev=rev+ch[length-i-1];
	}
	System.out.println(rev  );
		
	}

}
