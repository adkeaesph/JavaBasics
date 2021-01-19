package StringPoolArea;

public class StringPoolAreaDemo {

	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "hi";
		String s3 = s1;
		String s4 = new String("hi");
		String s7 = s4;
		String s8 = s4.intern();
		String s5 = new String("hi");
		String s6 ="hi";
		
		System.out.println(s1==s2 && s2==s3 && s1==s3);
		System.out.println(s1 == s4);
		System.out.println(s2 == s5);
		System.out.println(s4 == s5);
		System.out.println(s6 == s5);
		System.out.println(s7 == s4);
		System.out.println(s7 == s5);
		System.out.println(s7 == s6);
		System.out.println(s8 == s7);
		System.out.println(s1 == s8 && s2 == s8 && s3 == s8 && s6 == s8);
		System.out.println(s4.intern() == s5.intern());
		

	}

}
