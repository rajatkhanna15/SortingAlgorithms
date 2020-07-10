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

}
