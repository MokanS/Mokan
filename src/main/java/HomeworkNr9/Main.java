package HomeworkNr9;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        elephant.eat();
        elephant.sleep();
        Herbivore elephantGrazer = new ElephantGrazer();
        elephantGrazer.graze();
        elephantGrazer.rest();

    }
}
