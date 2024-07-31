package bash;

import java.util.Scanner;
public class mobileShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mobileShop2 phone = new mobileShop2();
        System.out.println("Enter the name of the manufacturer");
        String manuf = input.next();
        System.out.println("Enter the name of the model");
        String modil = input.next();
        System.out.println("Enter the name of the price");
        int retail = input.nextInt();
        phone.setManufact(manuf);
        phone.setModel(modil);
        phone.setRetailPrice(retail);
        String manufacturer = phone.getManufact();
        String model = phone.getModel();
        int retailPrice = phone.getRetailPrice();
        System.out.print("The phone was made by: "+ manufacturer +"\n"+
                "It  of the model: " + model + "\nThe price is: " + retailPrice);
    }
}
