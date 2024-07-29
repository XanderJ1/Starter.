public class sequential {
    public static boolean search(int [] numbers,int value){
        boolean x = false;
        int i =0;
        while ( i < numbers.length && !x ){
            if (numbers [i] == value){
                x = true;
            }
            i++;
        }
        return x;
    }

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,};
        int value = 3;
        boolean x = search(numbers, value);

    }
}
