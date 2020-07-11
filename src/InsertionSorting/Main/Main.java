package InsertionSorting.Main;

/**
 * Main class which acts as a tester class for ArrayInsertion class.
 */
import InsertionSorting.ArrayInsertion.ArrayInsertion;


import java.util.*;
public class Main {

    public static void main(String[] args) {
        ArrayInsertion aSelection = new ArrayInsertion(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items you want to enter :");
        int n = scanner.nextInt();
        System.out.println("Enter the data items:");
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            aSelection.insert(x);
        }
        System.out.println("The entered elements are :" );
        aSelection.display();

        System.out.println("Element in Sorted order:");
        aSelection.insertionSort();
        aSelection.display();
    }

}
