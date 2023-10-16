package FY2023;

public class OneArraytoother {

	public static void main(String[] args) 
	{
		int arr1[]={10,20,30,40,50}; //First array declaration
		
		int arr2[]=new int [arr1.length]; //Second array declaration
		
		//	Copy one array to another array
		for(int i=0;i< arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		
		//First Array
		System.out.println("Elements of First Array:");
		 for (int i=0;i< arr1.length;i++)
		 {
			 System.out.println(arr1[i]+ " ");
		 }
		 System.out.println();
		 
		 //New Array
		 System.out.println("Elements of New Array:");
		 for (int i=0;i< arr1.length;i++)
		 {
			 System.out.println(arr2[i]+ " ");
		 }
		 System.out.println();
		 
	}
}
