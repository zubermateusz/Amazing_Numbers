import java.util.*;

/*
* You are given three numbers: n , a and b.

Your task is to output the sum of the first n random numbers in a range from a to b inclusively. The seed of the generator should be set as a + b.

The input contains numbers in a single line in the following order: n, a, b.
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        int count = 0;
        Random random = new Random(a + b);
        do{
            int tempRandom = random.nextInt(a,b +1);
            if (tempRandom >= a && tempRandom <= b) {
                sum += tempRandom;
                count++;
            }
        } while (count < n);
        System.out.println(sum);
    }
}