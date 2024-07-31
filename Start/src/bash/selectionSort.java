package bash;

/**
 * This is an implementation of the selection sort algorithm
 */
public class selectionSort {
    public static void main(String[] args) {
        int [] array = {1,5,3,6,9,};
        for (int i = 0; i < array.length-1; i++){
            int minIndex = i;
            for (int j=i+1; j<array.length; j++){
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            swap(array,i,minIndex);
        }
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    /**
     * This is the swap function used to swap the values in order to rearrange them
     * @param array This is the bash.Append.array to search in
     * @param a This is a value to be swapped
     * @param b This is a value to be swapped
     */
    public static void swap(int [] array, int a, int b){

        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}