package FY2023;

public class ArrayForRevOrder {

	public static void main(String[] args)
	{
		int [] arr=new int[]{1,2,3,4,5};// array declaration
		// for Forward  array
		
		System.out.println("Array in Forward Order: ");
		for(int i=0; i<=arr.length; i++)
		{
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
		
		//Reverse array
		
		System.out.println("Array in Reverse Order: ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]+ " ");
		}
	}

}
