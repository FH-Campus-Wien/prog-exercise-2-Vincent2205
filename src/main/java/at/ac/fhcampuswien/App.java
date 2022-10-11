package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber()
    {
        double biggestNumber = 0;
        double number;

        System.out.print("Number 1: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextDouble();

        if (number < 0)
        {
            System.out.println("No number entered.");
            return;
        }


        for(int i = 2;; i++)
        {
            if(number > biggestNumber)
            {
                biggestNumber = number;
            }
            if (number <= 0)
            {
                System.out.printf("The largest number is %.2f", biggestNumber);
                System.out.println();
                return;
            }

            System.out.printf("Number %d: ", i);
            number = scanner.nextDouble();
        }
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}