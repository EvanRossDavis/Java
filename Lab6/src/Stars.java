import java.util.Scanner;

/**
 * Produce star patterns demonstrating nested loops.
 * 
 * 
 * @author YOUR NAME
 * @version TODAY'S DATE
 */
public class Stars {
    
    public static void main(String[] args) {
        int maxRows;  // maximum number of rows to print
        int starCnt;  // stars per row
        int blnkCnt;  // blanks preceding the stars
        
        Scanner stdIn;  // standard input
        stdIn = new Scanner(System.in);
        
        System.out.print("Enter a positive integer for the number of rows: ");
        maxRows = stdIn.nextInt();
        while (maxRows <= 0) {
            System.out.print("\nYou did not enter a POSITIVE number.");
                System.out.printf(" You entered %d!\n", maxRows);
            System.out.print("Enter a positive number for the number of rows: ");
            maxRows = stdIn.nextInt();
        }
        
        //***************************************************
        // First Example, stars per row goes from 1 to maxRow
        //***************************************************
        System.out.println();
        System.out.println("Class example\n");
        for (int row = 1; row <= maxRows; row++) {
            starCnt = row;
            for (int star = 1; star <= starCnt; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //*******************************************************
        // Insert code for patterns (A), (B), (C), and (D) below.
        //*******************************************************
        System.out.println();
        System.out.println("Example A\n");
        for (int row = 1; row <= maxRows; row++) {
            starCnt = row;
            for (int star = maxRows; star >= starCnt; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Example B\n");
        
        int rows, spaceCnt, 
        k = (2 * maxRows - 2);
        
        // outer loop to handle number of rows
        //  maxRows in this case
        for(rows = 0; rows < maxRows; rows++) {
        	 //  values changing acc. to outer loop////
            for(starCnt = 0; starCnt <= rows; starCnt++)
            {
                // printing stars
                System.out.print("*");
            }
        	// inner loop to handle number spaces
            // values changing acc. to requirement
        	for(spaceCnt  = 0; spaceCnt  < k; spaceCnt++) {
                // printing spaces
                System.out.print(" ");
            }
            // decrementing k after each loop/////////
            k = k - 2;////////////////////////////////
            //  inner loop to handle number of columns
           
             
            // ending line after each row
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Example C\n");
        for (int i = 0; i < maxRows; i++) {
            for (int j = 0; j < i; j++) {    
                System.out.print("");
            }
            for (int j = i; j < maxRows; j++) {    
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Example D\n");
       
        int userNum;
        int i;
        int j;

        userNum  = 3;

        /* Your solution goes here  */
        for ( i = 0; i <= userNum; i++) {
        	for ( j = 0; j < i; j++) {
        	System.out.print(" "); // print spaces
        	}
        	System.out.println(i); // print numbers
        	}
    
        
    
    }
}

