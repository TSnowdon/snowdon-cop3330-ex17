import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {

    private static final double MALE_RATIO = 0.73;
    private static final double FEMALE_RATIO = 0.66;
    private static final double LEGAL_BAC = 0.08;

    public static void main(String[] args) {
        double alcohol;
        double bodyWeight;
        double ratio;
        double hours;
        double bac;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        try {
            ratio = reader.nextDouble() == 1 ? MALE_RATIO : FEMALE_RATIO;
            System.out.print("How many ounces of alcohol did you have? ");
            alcohol = reader.nextDouble();
            System.out.print("What is your weight, in pounds? ");
            bodyWeight = reader.nextDouble();
            System.out.print("How many hours has it been since your last drink? ");
            hours = reader.nextDouble();

            bac = ((alcohol * 5.14 / bodyWeight * ratio) - (0.015 * hours));
            System.out.printf("\nYour BAC is %f. \n", bac);
            System.out.println(bac < LEGAL_BAC ? "It is legal for you to drive" : "It is not legal for you to drive");
        } catch (Exception e) {
            System.out.println("Invalid input, please restart the program and try a different value.");
        }
    }
}
