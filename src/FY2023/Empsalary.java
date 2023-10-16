package FY2023;

import java.util.*;

public class Empsalary {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the Emp Name :");
		String name = sc.next();
        
        System.out.println("Enter the Emp Id :");
		int id = sc.nextInt();
        
		System.out.println("Enter the Emp Designation :");
		String design = sc.next();
		
        System.out.println("Enter the Emp YOE :");
		int yoe = sc.nextInt();
		
		System.out.println("Enter the Emp Salary :");
		int sal = sc.nextInt();
		
		int DA=500;
		int HRA=1000;
		int PF=1500;
		
		int gross_sal=(sal+DA+HRA);
	
        int net_salary=(gross_sal-PF);
       /* {
        int gross_sal=30000;
		if(gross_sal>40000)
		{
			System.out.println("gross_sal is Greater");
		}
		else if(gross_sal>20000)
		{
			System.out.println("gross_sal is greater");
		}*/
		
	    System.out.println("Employee Name: "+name);
        System.out.println("Employee Id: "+id);
        System.out.println("Employee Designation: "+design);
        System.out.println("Employee YOE: " +yoe);
        System.out.println("Employee Salary: "+sal);
        System.out.println("Gross Salary :" +gross_sal);
        System.out.println("Net Salary :" +net_salary);
        
        sc.close();
        
	}
}

