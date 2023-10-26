package HomeworkNr10;
import java.util.function.Supplier;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Bonus {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i != 100; i++)
            intList.add(i);

        Supplier<Integer> randomSupplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };

        testIntList(intList, randomSupplier);
    }

    public static void testIntList(List<Integer> inputList, Supplier<Integer> supplier) {
        for (int i = 0; i < 10; i++) {
            Integer randomValue = supplier.get();
            System.out.println("Случайное число: " + randomValue);
        }
    }
}