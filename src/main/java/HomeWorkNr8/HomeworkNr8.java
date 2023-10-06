package HomeWorkNr8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeworkNr8 {
    public static void main(String[] args) {


        List<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Груша");
        fruits.add("Вишня");
        fruits.add("Слива");
        fruits.add("Груша");
        System.out.println(fruits);
        System.out.println(uniqueFruits(fruits));
    }
    public static Set<String> uniqueFruits(List<String> fruits){
        Set<String> unique = new HashSet<>();
        for (String x:fruits){
        unique.add(x);
        }
        return unique;
    }
}
