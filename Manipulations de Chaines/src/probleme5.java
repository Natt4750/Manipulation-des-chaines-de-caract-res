import java.util.Scanner;

/*
* Author : nasser
*Date : Jan. 7, 2021
*/
public class probleme5
	{
				public static void main(String[] args)
					{
				        Scanner sc = new Scanner(System.in);
				        int N = Integer.parseInt(sc.nextLine());
				        
				        
				        for (int i = 0; i < N; i++)
				        {
				            StringBuilder output = new StringBuilder();
				            String line = sc.nextLine();
				            String current = String.valueOf(line.charAt(0));
				            int count = 0;
				            for (int x = 0; x < line.length(); x++)
				            {
				                String character = String.valueOf(line.charAt(x));
				                if (character.equals(current)){
				                    count++;
				                    continue;
				                }
				                
				                output.append(count);
				                output.append(" ");
				                output.append(current);
				                output.append(" ");
				                
				                
				                count = 1;
				                current = character;
				            }
				            output.append(count);
				            output.append(" ");
				            output.append(current);
				            System.out.println(output.toString());
				        }
				    }
				

			}

	
