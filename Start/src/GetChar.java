public class GetChar {
    public static void main(String[] args) {
        String bash = "abcdefghijklmnopqrstuvwxyz";
        char [] cash = new char[27];
        cash = bash.toCharArray();
        char first = cash[0];
        for(int i=0; i<cash.length;i++){
            if (i<cash.length-1)
                cash[i] = cash[i+1];

        }
        cash[cash.length-1] = first;
        System.out.println(cash);
    }
}