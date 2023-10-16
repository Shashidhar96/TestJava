package FY2023;

import java.io.*;

import java.io.IOException;
import java.util.Scanner;

public class FileWrite 
{

	public static void main(String[] args) 
	{
		try 
		{
			File myObj= new File ("D://sampletxt");
			Scanner myReader= new Scanner(myObj);
			while (myReader.hasNextLine())
			{
				String data=myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}	
		catch(IOException e)
		{
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}

}
