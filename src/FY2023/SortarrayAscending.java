package FY2023;

public class SortarrayAscending {

	public static void main(String[] args)
	{
		int[] arr={30,25,29,18,2};
		for (int j=1; j<arr.length;j++)
		{
			for (int i=1;i<arr.length;i++)
			{
				if (arr[i-1] > arr[i])  //'>'->Ascending and '<'->Descending
				{
					int temp = arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}
}
