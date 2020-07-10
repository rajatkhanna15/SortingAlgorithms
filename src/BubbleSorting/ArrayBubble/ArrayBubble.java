package BubbleSorting.ArrayBubble;

/**
 * ArrayBubble class to show the implementation of Bubble sort.
 */
public class ArrayBubble {
    /**
     * Instance variables - an array to store the data items  and
     *                    - an integer variable to store the data items.
     */
    private int[] intArray;
    private int nElems;

    /**
     * Parametrised constructor to initialise the array and initialise nElems to 0.
     * @param max the max
     */
    public ArrayBubble(int max)
    {
        intArray = new int[max];
        nElems = 0;
    }


    /**
     * insert() method to insert the data items in the array and as a result increment the number of elements.
     * @param value the value
     */
    public void insert(int value)
    {
        intArray[nElems] = value;
        nElems++;
    }


    /**
     * display() method to display the data items.
     */
    public void display()
    {
        for (int i = 0; i < nElems; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }




}
