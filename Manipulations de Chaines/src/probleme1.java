import java.util.Scanner;

/*
* Author : nasser
*Date : Jan. 6, 2021
*/
public class probleme1
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int apples;
				int bananas;
				int a,a2,a3;
				int b,b2,b3;
				
				
				

				a=sc.nextInt()*3;
				a2=sc.nextInt()*2;
				a3=sc.nextInt();
				apples=a+a2+a3;
				
				b=sc.nextInt()*3;
				b2=sc.nextInt()*2;
				b3=sc.nextInt();
				bananas=b+b2+b3;
				
				if(apples>bananas)
					System.out.println("A");
				else
					if(bananas>apples)
						System.out.println("B");
					else
						if(bananas==apples)
							System.out.println("T");
				
				
				
				
			

			}

	}
