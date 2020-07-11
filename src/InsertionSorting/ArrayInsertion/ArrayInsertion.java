package InsertionSorting.ArrayInsertion;

/**
 * ArrayInsertion class for showing the basic implementation of Insertion Sort.
 */
public class ArrayInsertion {
    /**
     * Instance variables :
     * intArray[] for storing the data items.
     * nElems for storing the number of elements.
     */
    private int[] intArray;
    private int nElems;

    /**
     * Parametrised constructor to declare array with max and initialise nElems to 0.
     * @param max the max
     */
    public ArrayInsertion(int max)
    {
        intArray = new int[max];
        nElems = 0;
    }

}
