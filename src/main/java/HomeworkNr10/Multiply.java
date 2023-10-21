package HomeworkNr10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Multiply {
        public static void main(String[] args) {
            List<Integer> intList = new ArrayList<>();
            for (int i = 0; i != 100; i++)
                intList.add(i);

            Function<Integer, Integer> multiplyBy2 = (Integer number) -> {
                return number * 2;
            };

            testIntList(intList, multiplyBy2);
        }

        public static void testIntList(List<Integer> inputList, Function<Integer, Integer> function) {
            for (Integer element : inputList) {
                int result = function.apply(element);
                System.out.println(result);
            }
        }
    }

