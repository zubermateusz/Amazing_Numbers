package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        write your code here
        System.out.println("Enter a natural number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //check number is not natural
        if (!isNatural(number)) {
            System.out.println("This number is not natural!");
            System.exit(0);
        }

        System.out.println("Properties of " + number);

        if (isEven(number)) { // check is even
            System.out.println("        even: true");
        } else {
            System.out.println("        even: false");
        }
        if (!isEven(number)) { // check is odd
            System.out.println("         odd: true");
        } else {
            System.out.println("         odd: false");
        }

        if (isBuzz(number)) {
            System.out.println("        buzz: true");
        } else {
            System.out.println("        buzz: false");
        }

        if (isDuck(number)) {
            System.out.println("        duck: true");
        } else {
            System.out.println("        duck: false");
        }

/*      // number is Buzz number if last digit == 7 or number % 7 == 0
        if (number % 7 == 0 || number % 10 == 7) {
            if (number % 7 == 0 && number % 10 == 7) {
                System.out.println("It is a Buzz number.");
                System.out.println("Explanation:");
                System.out.println(number + " is divisible by 7 and ends with 7.");
            } else {
                if (number % 7 == 0) {
                    System.out.println("It is a Buzz number.");
                    System.out.println("Explanation:");
                    System.out.println(number + " is divisible by 7.");
                }
                if (number % 10 == 7) {
                    System.out.println("It is a Buzz number.");
                    System.out.println("Explanation:");
                    System.out.println(number + " ends with 7.");
                }
            }
        } else {
            System.out.println("It is not a Buzz number.");
            System.out.println("Explanation:");
            System.out.println(number+ " is neither divisible by 7 nor does it end with 7.");
        }

 */ //STAGE 1/8
    }

    private static boolean isDuck(int number) {
        boolean isDuckNumber = false;
        StringBuilder numberInText = new StringBuilder();
        numberInText.append(number);
        for (int i = 1; i < numberInText.length(); i++) {
            if (numberInText.charAt(i) == '0') {
                isDuckNumber = true;
                break;
            }
        }
        return isDuckNumber;
    }

    private static boolean isBuzz(int number) {
        boolean isBuzzNumber = false;
        if (number % 7 == 0) {
            isBuzzNumber = true;
        }
        if (number % 10 == 7) {
            isBuzzNumber = true;
        }
        return isBuzzNumber;
    } // check the number is Buzz number


    private static boolean isEven(int number) {
        return number % 2 == 0;
    } // check is odd or even

    private static boolean isNatural(int number) {
        return number > 0;
    } // check is Natural
}
