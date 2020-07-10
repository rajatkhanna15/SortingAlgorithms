package BubbleSorting.Main;

/**
 * Main class which acts as a tester class for ArrayBubble class.
 */
import BubbleSorting.ArrayBubble.ArrayBubble;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        ArrayBubble abubble = new ArrayBubble(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items you want to enter :");
        int n = scanner.nextInt();
        System.out.println("Enter the data items:");
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            abubble.insert(x);
        }
        System.out.println("The entered elements are :" );
        abubble.display();

        System.out.println("Element in Sorted order:");
        abubble.bubbleSort();
        abubble.display();
    }

}
