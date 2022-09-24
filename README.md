# DiceGame
import java.util.Random;
import java.util.Scanner;

 

public class Emulation_N_Dice {
    public static void main(String args[])
    {

        System.out.println("Enter the number of dice: ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Random rand = new Random();
