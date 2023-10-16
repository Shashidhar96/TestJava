package FY2023;

import java.io.*;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) 
	{
		try 
		{
			File Obj = new File ("D://sampletxt");
			if(Obj.createNewFile())
			{
				System.out.println("File created: "+ Obj.getName());
			}
			else
			{
				System.out.println("File already exists.");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occured.");
		}
	}

}
