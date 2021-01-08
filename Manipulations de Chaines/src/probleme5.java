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
				        int NofL = Integer.parseInt(sc.nextLine());
				        
				        
				        for (int i = 0; i < NofL; i++)
				        {
				            StringBuilder output = new StringBuilder();
				            String line = sc.nextLine();
				            String presentValue = String.valueOf(line.charAt(0));
				            int cpt = 0;
				            
				            for (int x = 0; x < line.length(); x++)
				            {
				                String character = String.valueOf(line.charAt(x));
				                if (character.equals(presentValue))
				                {
				                    cpt++;
				                    continue;
				                }
				                
				                output.append(presentValue);
				                output.append(" ");
				                output.append(presentValue);
				                output.append(" ");
				             
				                cpt = 1;
				                presentValue = character;
				                
				            }
				            
				            output.append(cpt);
				            output.append(" ");
				            output.append(presentValue);
				            System.out.println(output.toString());
				        }
				    }
				

			}

	
