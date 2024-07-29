public class binarySearch {
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
    public static void swap(int [] array, int a, int b){
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}