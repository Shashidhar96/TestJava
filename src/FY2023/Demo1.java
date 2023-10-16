package FY2023;

public class Demo1 {

	public static void main(String[] args) {
		String s1="HelloJava";
		String s2="Coding";
		String s3
		="Knowlegde";
		
		Boolean x=s1.startsWith("Hello");
		System.out.println(x);
		
		System.out.println(s1.endsWith("ava"));
		System.out.println(s1.contains("J"));
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.substring(2,5));
		System.out.println(s1.substring(4));
		
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        }
	}
