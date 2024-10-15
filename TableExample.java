package Arrays;
import java.util.Scanner;
public class TableExample {
	public static void main(String[] args) {
		int row;
		int col=0;
		//declaration of a table having 3 row 5 colums
		int table[][];
		/*initializing number of row and number of column*/
		table=new int[3][5];
		/*index variable for row and column*/
		//int row,col;
		/*creating object of scanner*/
		Scanner sc= new Scanner(System.in);
		System.out.println("enter numbers for a table having 3 row and 5 columns:");
		for(row = 0;row<3;row++)
		{
			for(row = 0;row<3;row++)
			{
				table[row][col] = sc.nextInt();
			}
		}
		System.out.println("elements of table:");
		for(row = 0;row<3;row++)
		{
			for(row = 0;row<3;row++)
			{
				System.out.println(table[row][col]+"\t");
			}
			/*change line for next row*/
			System.out.println();		

		}
	}
}
