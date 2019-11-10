package assignment2.pkg3cop3530;
/************************************************************** 
Purpose/Description: BST class where positiveKeySum(), deleteMax(), and printTree() methods are implemented.
Author’s Panther ID:  3747216
Certification:
I hereby certify that this work is my own and none of it is the work of
any other person.
**************************************************************/

public class BinarySearchTree {
         private BinarySearchTreeNode root;
         public void insert( int key) {}
         public void delete(int key) {}
         public boolean find(int key) {return false;}
         
        //Adds all positive and nonzero values in BST
         public int positiveKeySum() {//A
            return positiveKeySumHelper(root);
         }
         public int positiveKeySumHelper(BinarySearchTreeNode n) {
                if(n.key <= 0)
                        return 0;
                else
                        return root.key + positiveKeySumHelper(n.left) + positiveKeySumHelper(n.right);
         }

        //Finds max value in binary search tree
         public int maxValue(BinarySearchTreeNode n) {
        // loops to find the rightmost leaf 
             BinarySearchTreeNode current = n; 
                 while (current.right != null)  
                    current = current.right;
                    return current.key; 
         } 

        //Deletes max value in BST
         public void deleteMax(){//B
             int x = maxValue(root); //Find max and store in x
                 delete(x);
         }

        //Prints tree in post order with root at the end
         public void printTree(){//C
            printTreeHelper(root);
         }
         private void printTreeHelper(BinarySearchTreeNode n) {
            if (n == null) 
                return;
            printTreeHelper(n.left); //LEFT
            printTreeHelper(n.right); //RIGHT
            System.out.print(root.key + " "); //ROOT
         }
}
