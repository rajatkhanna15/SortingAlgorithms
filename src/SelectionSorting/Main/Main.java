package SelectionSorting.Main;

import SelectionSorting.ArraySelection.ArraySelection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArraySelection aSelection = new ArraySelection(100);
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
        aSelection.SelectionSort();
        aSelection.display();
    }

}
