package com.company;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    inputNumberWindow();
        //inputNumberConsole();
    }

    public static void inputNumberWindow(){
        String input = JOptionPane.showInputDialog(null, "Insert a number");
        int number = 0;

        try{
            number = Integer.parseInt(input);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Only numbers are allowed");
            inputNumberWindow();
            System.exit(0);
        }

        String decimalMessage = "Decimal = " + number + '\n';
        String binaryMessage = "Binary = " + Integer.toBinaryString(number) + '\n';
        String hexadecimalMessage = "Hexadecimal = " + Integer.toHexString(number) + '\n';
        String octalMessage = "Octal = " + Integer.toOctalString(number);

        JOptionPane.showMessageDialog(null, binaryMessage + hexadecimalMessage + octalMessage);
    }

    public static void inputNumberConsole(){
        int number = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert a number");

        try{
            number = scan.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Only numbers are allowd");
            inputNumberConsole();
            System.exit(0);
        }

        String decimalMessage = "Decimal = " + number + '\n';
        String binaryMessage = "Binary = " + Integer.toBinaryString(number) + '\n';
        String hexadecimalMessage = "Hexadecimal = " + Integer.toHexString(number) + '\n';
        String octalMessage = "Octal = " + Integer.toOctalString(number);

        System.out.println(decimalMessage + binaryMessage + hexadecimalMessage + octalMessage);
    }
}
