package FY2023;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		 ArrayList l2=new ArrayList();
    	 l2.add("Delhi");
    	 l2.add("Mumbai");
    	 l2.add("Chennai");
    	 l2.add("Bengaluru");
    	 l2.add("Hyderabad");
    	
    	 System.out.println("l2--->"+l2);
    	 l2.remove(2);                    //Remove by INDEX
    	 
    	 System.out.println("l2--->"+l2);
    	 l2.remove("Mumbai");             //Remove by OBJECT
    	 
    	 System.out.println("l2--->"+l2);
	}

}
