package bash;

/**
 * This is an implementation of the binary search algorithm
 */
public class binarySearch {
    public static void main(String[] args) {
        int [] numbers = {1,5,8,13,15,16,17,19,21,32,36};
        System.out.println("The position is: " + search(numbers,17));
    }

    /**
     *This is a function used to search for an item and
     * return the position it was found.
     * @param array Specific array to be searched
     * @param a the value to be searched in the array
     * @return index the position at which the value was found
     */
    public static int search(int [] array, int a){
        int low = 0;
        int high = array.length-1;
        int middle = -1;
        int index = -1;

        while (low <= high){
            middle = low + (high - low)/2;
            if (array[middle] == a){
                index = middle;
                break;
            }
            else if (array[middle] < a) {
                low = middle+1;
            }
            else {
                high = middle-1;
            }
        }
        return index;
    }
}
