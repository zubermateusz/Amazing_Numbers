package numbers;

public class Functions {

    protected static boolean isSpy(long number) {
        boolean flag = false;
        long sum = 0;
        long product = 1;

        StringBuilder numberText = new StringBuilder(number + "");

        for (int i = 0; i < numberText.length(); i++) {
            sum += Long.parseLong(numberText.charAt(i) + "");
        }
        for (int i = 0; i < numberText.length(); i++) {
            product *= Long.parseLong(numberText.charAt(i) + "");
        }
        if (sum == product) {
            flag = true;
        }
        return flag;
    }

    protected static boolean isGapful(long number) {
        boolean flag = false;
        StringBuilder numberText = new StringBuilder(number + "");
        if (numberText.length() >= 3) {
            if (number % (Long.parseLong(numberText.charAt(0) +"") * 10  + Long.parseLong(numberText.charAt(numberText.length() - 1) +"")) == 0) {
                flag = true;
            }
        }
        return flag;
    }

    protected static boolean isPalindromic(long number) {
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

    protected static boolean isDuck(long number) {
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

    protected static boolean isBuzz(long number) {
        boolean isBuzzNumber = number % 7 == 0;
        if (number % 10 == 7) {
            isBuzzNumber = true;
        }
        return isBuzzNumber;
    } // check the number is Buzz number


    protected static boolean isEven(long number) {
        return number % 2 == 0;
    } // check is odd or even

    protected static boolean notNatural0(long number) {
        return number < 0;
    } // check is Natural

}
