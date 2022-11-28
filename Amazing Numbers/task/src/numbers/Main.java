package numbers;

import java.util.Arrays;
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


        for(;;) {

            System.out.println("Supported requests:\n" +
                    "- enter a natural number to know its properties;\n" +
                    "- enter two natural numbers to obtain the properties of the list:\n" +
                    "  * the first parameter represents a starting number;\n" +
                    "  * the second parameter shows how many consecutive numbers are to be printed;\n" +
                    "- separate the parameters with one space;\n" +
                    "- enter 0 to exit.");
            System.out.println();

            System.out.print("Enter a request: ");

            String line = scanner.nextLine();

            if (line.length() > 0) { // no argument in line from user
                long[] numbers = Arrays.stream(line.split(" ")).mapToLong(Long::parseLong).toArray();


                    long number = numbers[0];// STAGE 3/8 scanner.nextLong();
                    System.out.println(); // new line after enter the number
                    if (number == 0) {
                        System.out.println("Goodbye!");
                        System.exit(0);
                    } // exit

                    if (!isNaturalor0(number)) {
                        System.out.println("The first parameter should be a natural number or zero.");
                        System.out.println();
                        // STAGE2/8System.out.println("This number is not natural!");
                        // STAGE2/8System.exit(0);
                    } //check number is not natural and restart menu
                    else {
                        if (numbers.length == 1) { //only 1 parameter
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

                            if (isGapful(number)) { // check is odd
                                System.out.println("         gapful: true");
                            } else {
                                System.out.println("         gapful: false");
                            }

                            if (isBuzz(number)) { // check isBuzz Number
                                System.out.println("        buzz: true");
                            } else {
                                System.out.println("        buzz: false");
                            }

                            if (isDuck(number)) { // check isDuck number
                                System.out.println("        duck: true");
                            } else {
                                System.out.println("        duck: false");
                            }

                            if (isPalindromic(number)) { // check is Plindromic
                                System.out.println(" palindromic: true");
                            } else {
                                System.out.println(" palindromic: false");
                            }
                            System.out.println(); // new line at the end
                        }
                        if (numbers.length == 2) {// 2 parameters
                            if (!isNaturalor0(numbers[1])) {
                                System.out.println("The second parameter should be a natural number.");
                                System.out.println();
                            } else {
                                for (int i = 0; i < numbers[1]; i++) {
                                    System.out.print("             " + (numbers[0] + i) + " is");
                                    if (isBuzz(number + i)) {
                                        System.out.print(" buzz,");
                                    }
                                    if (isDuck(number + i)) {
                                        System.out.print(" duck,");
                                    }
                                    if (isGapful(number + i)) {
                                        System.out.print(" gapful,");
                                    }
                                    if (isPalindromic(number + i)) {
                                        System.out.print(" palindromic,");
                                    }
                                    if (isEven(number + i)) {
                                        System.out.println(" even");
                                    }
                                    if (!isEven(number + i)) {
                                        System.out.println(" odd");
                                    }
                                }
                            }
                        }
                    }





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

    private static boolean isGapful(long number) {
        boolean flag = false;
        StringBuilder numberText = new StringBuilder(number + "");
        if(number % (Long.parseLong(numberText.charAt(0) + numberText.charAt(numberText.length()-1) + "")) == 0)
            flag = true;
        return flag;
    }

    private static boolean isPalindromic(long number) {
        boolean isPalindromicNumber = true;
        String[] arrayOfNumber = ("" + number).split("");
        for (int i = 0, k = arrayOfNumber.length - 1; i < arrayOfNumber.length / 2; i++, k--) {
            if (!arrayOfNumber[i].equals(arrayOfNumber[k])) {
                isPalindromicNumber = false;
                break;
            }

        }
        return isPalindromicNumber;
    }

    private static boolean isDuck(long number) {
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

    private static boolean isBuzz(long number) {
        boolean isBuzzNumber = false;
        if (number % 7 == 0) {
            isBuzzNumber = true;
        }
        if (number % 10 == 7) {
            isBuzzNumber = true;
        }
        return isBuzzNumber;
    } // check the number is Buzz number


    private static boolean isEven(long number) {
        return number % 2 == 0;
    } // check is odd or even

    private static boolean isNaturalor0(long number) {
        return number > 0;
    } // check is Natural
}
