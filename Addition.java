import javax.swing.*;

public class Addition {
    public static void main(String[] args) {
        String First, Second;
        int num1, num2, sum;
        First = JOptionPane.showInputDialog("Enter the Value of first integer value:");
        Second = JOptionPane.showInputDialog("Enter the value of the second integer value:");
        num1 = Integer.parseInt(First);
        num2 = Integer.parseInt(Second);
        sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "---------Java Program to Add Two number---------\n The sum of " + num1 + " and " + num2 + " is  " + sum);
    }
}