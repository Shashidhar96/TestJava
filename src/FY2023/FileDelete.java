package FY2023;

import java.io.File;

public class FileDelete {

	public static void main(String[] args)
	{
       File myObj = new File ("D://sampletxt");
       if(myObj.delete())
       {
    	   System.out.println("Deleted the File: " +myObj.getName());
       }
       else
       {
    	   System.out.println("Failed to Delete the File.");
       }

	}

}
