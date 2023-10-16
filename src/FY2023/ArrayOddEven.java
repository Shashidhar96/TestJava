package FY2023;

public class ArrayOddEven {

	public static void main(String[] args) 
	{
		int [] arr = new int [] {1,2,3,4,5}; //array declaration
		
		//For odd position initialize i=0 and increment by +2
		
		System.out.println("Elements of Array presentr on Odd Position: ");
		
		for (int i=0; i< arr.length;i=i+2)
		{
			System.out.println(arr[i]+ " ");
		}
        System.out.println(" ");
        
      //For even position initialize i=1 and increment by +2
		
      		System.out.println("Elements of Array presentr on Odd Position: ");
      		
      		for (int i=1; i< arr.length; i=i+2)
      		{
      			System.out.println(arr[i]+ " ");
      		}
	}

}
