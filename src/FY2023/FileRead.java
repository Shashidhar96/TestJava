package FY2023;

import java.io.FileWriter;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) 
	{
		try 
		{
			FileWriter myWriter= new FileWriter ("D://sampletxt");
			myWriter.write("Hi Sir/Madam");
			myWriter.write("As per the above requiremnt the Schedule Build is to be Phase 1");
			myWriter.close();
				System.out.println("Successfully Wrote to the File");
			}
			
		catch(IOException e)
		{
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		

	}

}
