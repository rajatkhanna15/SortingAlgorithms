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

    /**
     * insert() method to insert the values in the array.
     * @param value the value to be inserted.
     */
    public void insert(int value)
    {
        intArray[nElems] = value;
        nElems++;
    }

    /**
     * display() method to display the elements in the array.
     */
    public void display()
    {
        for (int i = 0; i < nElems; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * insertionSort() method to show the implementation of Insertion Sort.
     */
    public void insertionSort()
    {
        int in , out;
        for (out = 1; out < nElems; out++) {
            int temp = intArray[out];                                   //Element at first index.
            in = out;
            while(in > 0 && intArray[in-1] >= temp)
            {
                intArray[in] = intArray[in-1];
                --in;
            }
            intArray[in] = temp;
        }
    }
}
