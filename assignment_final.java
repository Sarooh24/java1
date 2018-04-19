/*Names & ID's
 *Rawan Aldhafiri - 381200096
 *Sara Almokbel - 371200278
 *Amirah Ahmed - 371200508
 *Section: 201
 **/
import java.util.Scanner;
public class assignment_final{
	public static void main(String []args){
		
		//The variables
		//x for chosen row in seating minus 1 (to convert number to index), y for the index of the chosen column letter
		int x = 0, y = 0;
		//colChoice to choose column letter
		String colChoice = "";
		//Choice to continue choosing seats or not both times
		String cont1 = "", cont2 = "";
		
		//Instantiating Scanner object
		Scanner kb = new Scanner(System.in);
		
		//Prompt user to enter no. of rows (of the array)
		System.out.print("Enter how many rows in seating arrangement\t: ");
		int row = kb.nextInt();
		System.out.print("\n");
		
		//1D array for the rows
		int[] a = new int[row];
		//2D array for the letters
		String[][] b = new String[row][4];

		//Available seats message
		System.out.println("==========================================================");

		System.out.println("=                    Available Seats                     =");

		System.out.println("==========================================================");
		
		//Nested for loop to initilize elements of the arrays (according to user input)
		//i starts from zero (index of rows) is always less than no. of elements in the 1D array (index is always less by 1)
		//loops each column, j starts from zero (index of columns) is always less than no. of column letters
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<4; j++)
			{
				//beginning of row (index 0)
			   if(j==0)
			   {
			   	a[i] = j + (i+1);
			   }
			   //printing column letters according to 2D array index
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
		//i starts from zero (index of rows) is always less than no. of elements in the 1D array (index is always less by 1)
		for(int i = 0; i<a.length; i++)
		{
			//loops each column, j starts from zero (index of columns) is always less than no. of column letters
			for(int j = 0; j<4; j++)
			{
				//beginning of row (index 0)
			   if(j==0)
			   {
			   	//print 1D array (row number)
			   	System.out.print("\n" + a[i] + "\t");	
			   }
			   //print 2D array (column letters)
			   System.out.print(b[i][j]  + "\t");
			}
		}
		
		//Prompt user to choose seat
		System.out.println("\n");
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
			
			//Taken seats (2D array row and column elements) get replaced with 'X'
			//Translates colChoice to y (corresponding column index)
			//Choice from A,B,C or D capital or small
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
		
		//Nested loop to display final seating
		//i starts from zero (index of rows) is always less than no. of elements in the 1D array (index is always less by 1)
		for(int i = 0; i<a.length; i++)
		{
			//loops each column, j starts from zero (index of columns) is always less than no. of column letters
			for(int j = 0; j<4; j++)
			{
				//beginning of row (index 0)
			   if(j==0)
			   {
			   //print 1D array (row number)
			   	System.out.print("\n" + a[i] + "\t");	
			   }
			   //print 2D array (column letters)
			   System.out.print(b[i][j]  + "\t");
			}
		}
		
		//Welcoming message
		System.out.println("\n");
		System.out.println("=== Welcome Back ===");
		System.out.println();
		
		//Prompt user to choose seat
		System.out.println("Choose your seat");
		
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
		    
		    //Taken seats (2D array row and column elements) get replaced with 'X'
		    //Translates colChoice to y (corresponding column index)
			//Choice from A,B,C or D capital or small
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
		      
		    //When the seat is taken, display error message that returns the row no. and column letter the user entered
		    if(b[x-1][y].equals("X"))
		    	System.out.println("\nThe seat " + x + colChoice + " is already taken please choose another.");
		    else{
		    //When seat is available, replace it with 'X'
		    	b[x-1][y] = "X";
		    }
		    
		    //Asks user to continue or stop choosing seats
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
		
		//Nested loop to display final seating
		//i starts from zero (index of rows) is always less than no. of elements in the 1D array (index is always less by 1)
		for(int i = 0; i<a.length; i++)
		{
			//loops each column, j starts from zero (index of columns) is always less than no. of column letters
			for(int j = 0; j<4; j++)
			{
				//beginning of row (index 0)
			   if(j==0)
			   {
			   	//print 1D array (row number)
			   	System.out.print("\n" + a[i] + "\t");	
			   }
			   //print 2D array (column letters)
			   System.out.print(b[i][j]  + "\t");
			}
		}
	}
}