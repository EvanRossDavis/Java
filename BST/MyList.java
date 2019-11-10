package assignment2.pkg3cop3530;
import java.util.LinkedList;
/************************************************************** 
Purpose/Description: Performing O(1) operations on a LinkedList
Author’s Panther ID:  3747216
Certification:
I hereby certify that this work is my own and none of it is the work of
any other person.
**************************************************************/
//PART B
public class MyList {
    private LinkedList<Integer> list;
    //Constructor
    MyList() {
         list = new LinkedList<>();
    } 
//Insert item x on the front end of the MyList.
    void myPush(Integer x) {
         list.addFirst(x);
    } 
//Remove the front item from the MyList and return it.
    Integer myPop() {  
         return list.removeFirst();
    } 
//Insert item x on the rear end of the MyList
    void myInject(Integer x) { 
         list.addLast(x);
    } 
}
