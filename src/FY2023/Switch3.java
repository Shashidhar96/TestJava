package FY2023;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the year of the Patient");
	int year=sc.nextInt();
	
	System.out.println("Enter the Dosage of a Medicine Usage");
	int dosage=sc.nextInt();
	
	switch(year)
	{
	case 1:System.out.println("Patient year:"+12 );
	break;
	
	case 2:System.out.println("Patient year:"+24 );
	break;
	
	case 3:
		switch((int)dosage/10)
		{
		case 0://0 to 3
		case 1://4 to 12
		case 2:System.out.println("Dosage of the Medicine is Heavy");//13 to 18
		break;
		case 3:System.out.println("Dosage of the Medicine is Correcr");//19 to 60
		break;
	
		default:
	    System.out.println("Enter the valid dosage to Patient");
	    break;
		}
		break;
	
	default:System.out.println("Enter the valid year of Patient");
	break;
	}
	}
	}
