package javaLogic;

public class RemovingJunkChar {

	public static void main(String[] args) {
		String s="&^%$#@1234abc@#$%dAAADGCV@#$%$#";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
