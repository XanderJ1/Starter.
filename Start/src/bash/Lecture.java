package bash;

import java.util.Scanner;
public class Lecture {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/**          System.out.println("Enter your age");
        int myAge = input.nextInt();
        if (myAge >= 18 && myAge<= 100){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
       } */
        //Bmi

    int BMI, weight, height;
    height = input.nextInt();
    weight = input.nextInt();
    BMI = weight/height;
      System.out.println("Your BMI is " + BMI);
    if (BMI <= 25){
        System.out.println("You are underweight");
    }
    else if(BMI>=40) {
        System.out.println("You are overweight");
    }
    else {
        System.out.println("You are average");
    }
    }
}
