package javac2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        printIntroduction();
        var scanner = new Scanner(System.in);
        var result = getBMI(scanner);
        var status = getStatus(result);
        scanner.close();

        reportResults(5, result, status);
    }

    static void printIntroduction() {
        System.out.println("Welcome to BMI calculator!");
    }

    static float getBMI(Scanner scanner) {
        System.out.println("Enter your height in inches: ");
        int height = scanner.nextInt();
        System.out.println("Enter your weight in pounds: ");
        int weight = scanner.nextInt();

        return bmiFor(weight, height);
    }

    static float bmiFor(int weight, int height) {
        return (float)weight*703/ (height*height);
    }

    static String getStatus(float bmi) {
        if (bmi > 30) {
            return "obese";
        }
        else if (bmi > 25) {
            return "overweight";
        }
        else if (bmi > 18.5) {
            return "normal";
        }
        else {
            return "underweight";
        }
    }

    static void reportResults(int number, float bmi, String status) {
        System.out.println("Person " + number + " has BMI " + Math.round(bmi*100)/100f + ": " + status);
    }
}
