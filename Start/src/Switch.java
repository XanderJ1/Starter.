

import javax.swing.*;
/**
 *  This code is used to switch between arguments
 */
public class Switch {
    public static void main(String[] args) {
        String month = JOptionPane.showInputDialog("Enter the number of the month");
        int Month = Integer.parseInt(month);
        switch (Month){
            case 1:
                JOptionPane.showMessageDialog(null,"January");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"February");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"March");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"April");
            case 5:
                JOptionPane.showMessageDialog(null,"June");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"July");
            case 7:
                JOptionPane.showMessageDialog(null,"August");
                break;
            default:
                JOptionPane.showMessageDialog(null,"You have entered an invalid month");
        }
        System.out.println("");
        System.out.println("Chicken = 7 GHS \n" +
        "Meat = 10 GHS \n" + "Egg = 3GHS");
        System.out.println("Choose the offer you prefer");
        System.out.println("Chicken = 1" +
        "Meat =1" + "Egg = 3");
        String offer = JOptionPane.showInputDialog("Choose the offer");
        String Offer = offer.toUpperCase();
        switch (Offer)
        {
            case "EGG":
                JOptionPane.showMessageDialog(null,"You egg is on the way");
                break;
            case "CHICKEN":
                JOptionPane.showMessageDialog(null,"You Chicken is on the way");
                break;
            case "MEAT":
                JOptionPane.showMessageDialog(null,"You Meat is on the way");
                break;
            default:
                JOptionPane.showMessageDialog(null,"We don't have what you want");
        }
    }
}
