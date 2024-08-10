

public class VariableArguments {
    public static void main(String[] args) {
        int one = 34, two = 55, three = 59, four = 26;
        int sum = sum(one,two,three,four);
        System.out.println(sum);
    }
    public  static int sum(int... operands){
        int total = 0;
        for (int val: operands) {
            total += val;
        }
        return total;
    }
}
