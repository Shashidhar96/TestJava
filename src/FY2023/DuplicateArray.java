package FY2023;

public class DuplicateArray {

	public static void main(String[] args)
	{
		int [] arr = new int[] {1,2,3,2,3};
		System.out.println("Duplicate elements in given array: ");
		
		//we have to compare the array element with the element itselt
		
		for(int i=0;i < arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
               
			}
		}
		

	}

}
