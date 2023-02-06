package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        write your code here

        System.out.println("Welcome to Amazing Numbers!");
        System.out.println();
/*        System.out.println("Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter 0 to exit.");
*/ //STAGE 3/8




        // System.out.println("Enter a natural number:"); STAGE 2/8
        Scanner scanner = new Scanner(System.in);
        boolean flagShowMenu = true;

        for(;;) {
            if (flagShowMenu) {
                System.out.println("""
                        Supported requests:
                        - enter a natural number to know its properties;
                        - enter two natural numbers to obtain the properties of the list:
                          * the first parameter represents a starting number;
                          * the second parameter shows how many consecutive numbers are to be printed;
                        - separate the parameters with one space;
                        - enter 0 to exit.""");
                System.out.println();
                flagShowMenu = false;
            }
            System.out.print("Enter a request: ");

            String line = scanner.nextLine();

            if (line.length() > 0) { // no argument in line from user
                String[] numbers = line.split(" ");


                    long number1 = Long.parseLong(numbers[0]);// STAGE 3/8 scanner.nextLong();
                    System.out.println(); // new line after enter the number1
                    if (number1 == 0) {
                        System.out.println("Goodbye!");
                        System.exit(0);
                    } // exit

                    if (Functions.notNatural0(number1)) {
                        System.out.println("The first parameter should be a natural number1 or zero.");
                        System.out.println();
                        // STAGE2/8System.out.println("This number1 is not natural!");
                        // STAGE2/8System.exit(0);
                    } //check number1 is not natural and restart menu
                    else {
                        if (numbers.length == 1) { //only 1 parameter
                            System.out.println("Properties of " + number1);

                            if (Functions.isEven(number1)) { // check is even
                                System.out.println("        even: true");
                            } else {
                                System.out.println("        even: false");
                            }
                            if (!Functions.isEven(number1)) { // check is odd
                                System.out.println("         odd: true");
                            } else {
                                System.out.println("         odd: false");
                            }

                            if (Functions.isGapful(number1)) { // check is gapful
                                System.out.println("      gapful: true");
                            } else {
                                System.out.println("      gapful: false");
                            }

                            if (Functions.isSpy(number1)) { // check is gapful
                                System.out.println("         spy: true");
                            } else {
                                System.out.println("         spy: false");
                            }

                            if (Functions.isBuzz(number1)) { // check isBuzz Number
                                System.out.println("        buzz: true");
                            } else {
                                System.out.println("        buzz: false");
                            }

                            if (Functions.isDuck(number1)) { // check isDuck number1
                                System.out.println("        duck: true");
                            } else {
                                System.out.println("        duck: false");
                            }

                            if (Functions.isPalindromic(number1)) { // check is Plindromic
                                System.out.println(" palindromic: true");
                            } else {
                                System.out.println(" palindromic: false");
                            }
                            System.out.println(); // new line at the end
                        }
                        if (numbers.length == 2) {// 2 parameters
                            long number2 = Long.parseLong(numbers[1]);
                            if (Functions.notNatural0(number2)) {
                                System.out.println("The second parameter should be a natural number1.");
                                System.out.println();
                            } else {
                                for (int i = 0; i < number2; i++) {
                                    System.out.print("             " + (numbers[0] + i) + " is");
                                    if (Functions.isBuzz(number1 + i)) {
                                        System.out.print(" buzz,");
                                    }
                                    if (Functions.isDuck(number1 + i)) {
                                        System.out.print(" duck,");
                                    }
                                    if (Functions.isGapful(number1 + i)) {
                                        System.out.print(" gapful,");
                                    }
                                    if (Functions.isSpy(number1 + i)) {
                                        System.out.print(" gapful,");
                                    }
                                    if (Functions.isPalindromic(number1 + i)) {
                                        System.out.print(" palindromic,");
                                    }
                                    if (Functions.isEven(number1 + i)) {
                                        System.out.println(" even");
                                    }
                                    if (!Functions.isEven(number1 + i)) {
                                        System.out.println(" odd");
                                    }
                                }
                            }
                        }
                    }





                } else {
                flagShowMenu = true;
            }

            System.out.println();
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
}
