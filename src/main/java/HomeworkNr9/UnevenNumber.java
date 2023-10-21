package HomeworkNr9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UnevenNumber {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i != 100; i++)
            intList.add(i);
        Predicate<Integer> testUnevenNumbers = (Integer i) -> {
            return i % 2 != 0;
        };
        testIntList(intList, testUnevenNumbers);
    }


    public static void testIntList(List<Integer> inputList, Predicate<Integer> testMethod) {
        for (Integer element :
                inputList) {
            if (testMethod.test(element) == true)
                System.out.println(element);
        }
    }
}
