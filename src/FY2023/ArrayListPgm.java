package FY2023;

import java.util.ArrayList;

public class ArrayListPgm {

	public static void main(String[] args) 
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("INDIA");
		ar.add("USA");
		ar.add("JAPAN");
		ar.add("FRANCE");
		
		ar.set(1,"Dates");
	
		System.out.println("Returning element: "+ar.get(1));
		System.out.println("New element :"+ar.set(1,"Dates"));
		System.out.println(ar);
	}
}
