package bash;

public class booleanMethods {
    public static void main(String[] args) {
        int num1 = 45;
        if (isValid(num1)){
            System.out.println("There is a monkey");
        }
        else {
            System.out.println("55");
        }
    }

    public static boolean isValid(int num1) {
        boolean status;
        if (num1>=25 && num1 <=70){
            status = true;
        }
        else{
            status = false;
        }
        return status;
    }
}
