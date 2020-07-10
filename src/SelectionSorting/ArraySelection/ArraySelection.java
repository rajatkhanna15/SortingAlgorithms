package SelectionSorting.ArraySelection;

/**
 * ArraySelection for showing the implementation of Selection Sorting.
 */
public class ArraySelection {
    /**
     * Instance variables :
     * an array to store data items
     * a variable to store number of elements
     */
    private int[] intArray;
    private int nElems;

    /**
     * Parameterised constructor to initialise the array and number of elements to 0.
     * @param max the max
     */
    public ArraySelection(int max)
    {
        intArray = new int[max];
        nElems = 0;
    }

    /**
     * insert() method to insert the values in the array and increase the number of elements.
     * @param value the value
     */
    public void insert(int value)
    {
        intArray[nElems] = value;
        nElems++;
    }

    /**
     * display() method to display the data items in the array.
     */
    public void display()
    {
        for (int i = 0; i < nElems; i++) {
            System.out.println(intArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * selectionSort() method to show the basic implementation of Selection Sorting.
     */
    public void SelectionSort()
    {
        int min;
        for(int sorted = 0;sorted < nElems - 1; sorted++)
        {
            min = sorted;
            for (int index = min+1; index < nElems; index++) {
                if(intArray[index] < intArray[min])
                    min = index;
                swap(intArray,sorted,min);
            }
        }
    }
}
