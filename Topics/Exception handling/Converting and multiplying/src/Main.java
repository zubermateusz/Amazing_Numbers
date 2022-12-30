import java.util.Scanner;
/*
Converting and multiplying
Your task is to write a program that reads a sequence of strings and converts them to integer numbers, multiplying by 10. Some input strings may have an invalid format, for instance: "abc". The sequence length may be different. Its ending is indicated by “0”. Zero serves as a stop character and should not be included in the sequence.

If a string can be converted to an integer number, output the number multiplied by 10. Otherwise, output the string "Invalid user input: X" where X is the input string. To better understand the scenario, see the examples below.

To implement this logic, use the exception handling mechanism.

Input data format:

A sequence of integer numbers and other strings, each on a new line.

Output data format:

A sequence of integer numbers and warnings, each on a new line.


Sample Input:
11
12
13
0

Sample Output:
110
120
130
 */

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            try {
                int number = Integer.parseInt(line);
                if (number == 0) break;
                System.out.println(number * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + line);
            }
        }
    }
}