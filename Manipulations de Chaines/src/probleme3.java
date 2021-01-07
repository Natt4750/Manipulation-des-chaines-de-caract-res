
/*
* Author : nasser
*Date : Jan. 7, 2021
*/
import java.util.Scanner;

public class probleme3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int NOL = sc.nextInt();
		
		
		int[] numberOfSymbols = new int[NOL];
		String[] symbolType = new String[NOL];
		
		
		for (int i = 0; i < NOL; i++) 
		{		
			numberOfSymbols[i] = sc.nextInt();
			symbolType[i] = sc.nextLine();
			symbolType[i] = symbolType[i].strip();			
		}
		sc.close();
		
		
		for (int i = 0; i < NOL; i++) 
		{		
			for (int j = 0; j < numberOfSymbols[i]; j++) 
			{
				System.out.print(symbolType[i]);
			}
			System.out.println();		
		}

	}

}

