package bash;

/**
 * This is an implementation of the sequential search algorithm
 */
public class sequentialSearch {
    public static void main(String[] args) {
        int [] numbers = {2,4,7,1,9,8,10};
        int result = search(numbers,11);
        if (result >= 0){
            System.out.println("Your search item is at index: " + result);
        }
        else {
            System.out.println("Sorry your search item is not in the bash.Append.array");
        }
    }

    /**
     * This function is used to search for an item in an bash.Append.array
     * @param array The bash.Append.array to search in.
     * @param target the target item to search
     * @return the index of the element when found Or -1 if it is not found
     */
    public static int search(int [] array, int target){
        for(int i=0; i < array.length; i++){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }
}
