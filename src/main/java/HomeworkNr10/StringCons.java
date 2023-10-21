package HomeworkNr10;
import java.util.function.Consumer;
public class StringCons {

    public class Main {
        public static void main(String[] args) {
            Consumer<String> printString = (String s) -> {
                System.out.println(s);
            };

            testStringList("Привет, мир!", printString);
        }

        public static void testStringList(String inputString, Consumer<String> printMethod) {
            printMethod.accept(inputString);
        }
    }

}
