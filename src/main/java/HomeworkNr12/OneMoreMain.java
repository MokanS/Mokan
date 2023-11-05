package HomeworkNr12;

public class OneMoreMain {

    public static void main(String[] args) {
        int number1 = 5;
        int number2 = -8;

        System.out.println("Number " + number1 + " is odd: " + CheckInteger.CHECK_IF_ODD.test(number1));
        System.out.println("Number " + number1 + " is positive: " + CheckInteger.CHECK_IF_POSITIVE.test(number1));
        System.out.println("Number " + number2 + " is even: " + CheckInteger.CHECK_IF_EVEN.test(number2));
        System.out.println("Number " + number2 + " is negative: " + CheckInteger.CHECK_IF_NEGATIVE.test(number2));
    }
}
