package FY2023;

import java.util.Scanner;

public class Studmarklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student Name :");
		
        String name = sc.nextLine();
        
        System.out.println("Enter the RegNo :");
		
        int RegNo = sc.nextInt();
        
        System.out.println("Enter the Marks of Five Subjects:");
        
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        
        int sum=a+b+c+d+e;
        System.out.println("Student Name: "+name);
        System.out.println("RegNo: "+RegNo);
        System.out.println("Total marks: " +sum);
        
        double avg=sum/5.0;
        System.out.println("Average marks: "+avg);
       
        sc.close();
        
        
        
	
	}

}
