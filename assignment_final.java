/*Our names*/
import java.util.Scanner;
public class assignment_final{
	public static void main(String []args){
		
		//The variables
		int x = 0, y = 0;
		String colChoice = "";
		String cont1 = "", cont2 = "";
		
		Scanner kb = new Scanner(System.in);
		
		//Prompt user to enter no. of rows (of the array)
		System.out.print("Enter how many rows in seating arrangement\t: ");
		int row = kb.nextInt();
		System.out.print("\n");
		
		//The arrays
		String[] a = new String[row];
		String[][] b = new String[row][4];

		//Available seats message
		System.out.println("==========================================================");

		System.out.println("=                    Available Seats                     =");

		System.out.println("==========================================================");
		
		//Nested for loop to initilize elements of the arrays (according to user input)
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<4; j++)
			{
			   if(j==0)
			   {
			   	a[i] = "" + (i+1);
			   }
			   
			   if(j==0)
			   	b[i][j] = "A";
			   	else if(j==1)
			   		b[i][j] = "B";
			   	else if(j==2)
			   		b[i][j] = "C";
			   	else if(j==3)
			   		b[i][j] = "D";
			   
			}
		}
		
		
		//Nested for loop to print the array table (according to user input)
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<4; j++)
			{
			   if(j==0)
			   {
			   	System.out.print("\n" + a[i] + "\t");	
			   }
			   
			   System.out.print(b[i][j]  + "\t");
			}
		}
		
		//Prompt user to choose seat
		System.out.println("\n\n");
		System.out.println("Choose your seat");
		
		do
		{
			//Prompt user to enter no. of row
			System.out.print("Enter the row\t: ");
		    x = kb.nextInt();
			
			//When user enters invalid row no.
			if(x>row || x<1){
		    	System.out.println("\nInvalid row choice. You can only choose from " + row + " rows.\n");
		    	continue;
			}
			
			//Prompt user to enter no. of columns
		    System.out.print("Enter the column\t: ");
		    colChoice = kb.next();
			
			//When user enters invalid column
			if(!colChoice.equalsIgnoreCase("A") && !colChoice.equalsIgnoreCase("B") && !colChoice.equalsIgnoreCase("C") && !colChoice.equalsIgnoreCase("D")){
				System.out.println("\nInvalid column choice. You can only choose from A, B, C, or D.\n");
				continue;
			}
			
			//Taken seats replaced with 'X'
		    if(colChoice.charAt(0) == 'A' || colChoice.charAt(0) == 'a'){
		    	y = 0;
		    	b[x-1][y] = "X";}
		      else if(colChoice.charAt(0) == 'B' || colChoice.charAt(0) == 'b'){
		      	y = 1;
		    	b[x-1][y] = "X";
		      }
		      else if(colChoice.charAt(0) == 'C' || colChoice.charAt(0) == 'c'){
		      	y = 2;
		    	b[x-1][y] = "X";
		      }
		      else if(colChoice.charAt(0) == 'D' || colChoice.charAt(0) == 'd'){
		      	y = 3;
		    	b[x-1][y] = "X";
		      }
		    //Ask user to continue or stop choosing seats
		    System.out.println();
			System.out.print("Continue to choose seat [y - yes | n - no]\t: ");
		    cont1 = kb.next();
		    
		    //n as a sentinel value to quit loop
		}while(!cont1.equalsIgnoreCase("n"));
		
			  //Final seat message
		      System.out.println();
		
		 	  System.out.println("==========================================================");

		      System.out.println("=     Final Seating - X means the seat is occupied       =");

		      System.out.println("==========================================================");
		
		//Displays final seating
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<4; j++)
			{
			   if(j==0)
			   {
			   	System.out.print("\n" + a[i] + "\t");	
			   }
			   
			   System.out.print(b[i][j]  + "\t");
			}
		}
		
		//Welcoming message
		System.out.println("\n");
		System.out.println("=== Welcome Back ===");
		System.out.println();
		
		do
		{
			//Prompt user to enter row no.
			System.out.print("Enter the row\t: ");
		    x = kb.nextInt();
		    
		    //When no. of rows is wrong
		    if(x>row || x<1){
		    	System.out.println("\nInvalid row choice. You can only choose from " + row + " rows.\n");
		    	continue;
		    }
		    
		    //Prompt user to enter row no.
		    System.out.print("Enter the column\t: ");
		    colChoice = kb.next();
		    
		    //When no. of columns is wrong
		    if(!colChoice.equalsIgnoreCase("A") && !colChoice.equalsIgnoreCase("B") && !colChoice.equalsIgnoreCase("C") && !colChoice.equalsIgnoreCase("D")){
				System.out.println("\nInvalid column choice. You can only choose from A, B, C, or D.\n");
				continue;
		    }
		    
		    //Available choices
		    if(colChoice.charAt(0) == 'A' || colChoice.charAt(0) == 'a'){
		    	y = 0;}
		      else if(colChoice.charAt(0) == 'B' || colChoice.charAt(0) == 'b'){
		      	y = 1;
		      }
		      else if(colChoice.charAt(0) == 'C' || colChoice.charAt(0) == 'c'){
		      	y = 2;
		      }
		      else if(colChoice.charAt(0) == 'D' || colChoice.charAt(0) == 'd'){
		      	y = 3;
		      }
		      
		    //When the seat is taken
		    if(b[x-1][y].equals("X"))
		    	System.out.println("\nThe seat " + x + colChoice + " is already chosen please choose another.");
		    else{
		    //When seat is available
		    	b[x-1][y] = "X";
		    }
		    
		    //Ask user to continue or stop choosing seats
		    System.out.println();
			System.out.print("Continue to choose seat [y - yes | n - no]\t: ");
		    cont2 = kb.next();
		    
		    //n as a sentinel value to quit loop
		}while(!cont2.equalsIgnoreCase("n"));
		      
		      //Final seating message
		      System.out.println();
		
		 	  System.out.println("==========================================================");

		      System.out.println("=     Final Seating - X means the seat is occupied       =");

		      System.out.println("==========================================================");
		
		//Displays final seating
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<4; j++)
			{
			   if(j==0)
			   {
			   	System.out.print("\n" + a[i] + "\t");	
			   }
			   
			   System.out.print(b[i][j]  + "\t");
			}
		}
	}
}