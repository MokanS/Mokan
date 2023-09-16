package homeworknr5;

public class HomeworkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 99; i >= 0; i--) {
            numbers[i] = 99 - i;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(numbers[i]);
        }
        int sum = 0;
        for (int i = 1; i < 100; i += 2) {
            sum += numbers[i];
        }
        System.out.println(sum);
        long comp = 1L;
        for (int i = 0; i < 100; i += 2) {
            comp *= numbers[i];
        }
        System.out.println(comp);
        int[] copyNumbers = new int[100];
        for (int i = 0; i < 100; i++) {
            copyNumbers[i] =numbers[i] ;
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(copyNumbers[i]);
        }
    }
}
