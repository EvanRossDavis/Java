/************************************************************** 
Purpose/Description: Sorting a stack using an auxiliary  stack
Author’s Panther ID:  3747216
Certification:
I hereby certify that this work is my own and none of it is the work of
any other person.
**************************************************************/
package assignment2.pkg3cop3530;
import java.util.Stack;

public class Assignment23COP3530 {
    public static Stack<Integer> sort(Stack<Integer> s) {
            Stack<Integer> auxStack = new Stack<>();
            while(!s.isEmpty()) { 
                    // pop last element of s
                    int temp = s.pop(); 
                    // while auxillary stack is not empty and top of auxillary stack is less than temp 
                    while(!auxStack.isEmpty() && auxStack.peek() < temp) { 
                            // pop from auxillary stack and 
                            // push it to the original stack    
                    s.push(auxStack.pop()); 
                    } 
                    // push temp to auxillary stack
                    auxStack.push(temp);
            }
            return auxStack; //Time complexity is O(n^2) given there is one while loop 
                                      //nested within another while loop inside the sort() method.
    }
    
    public static void main(String args[]) { 
            Stack<Integer> s = new Stack<>(); 
            s.push(9); 
            s.push(6); 
            s.push(8); 
            s.push(5); 
            s.push(4); 
            s.push(11); 
            s.push(4);
            // This is the auxiliary stack 
            Stack<Integer> auxStack = sort(s);
            System.out.print("Stack (from top): "); 
            while (!auxStack.empty()) {
                   System.out.print(auxStack.pop() + ","); 
            } 
    } 
    
}
