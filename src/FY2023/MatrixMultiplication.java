package FY2023;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		int a[][]={{10,20} , {30,40}};
		int b[][]={{5,10} , {20,50}};
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				System.out.print(a[i][j] *  b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
