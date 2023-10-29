package HomeworkNr9;

public interface Animal {
    void eat();
    void sleep();
    default void walk(){
        System.out.println("Animals is walking aroung");
    }
    static void makeSound(){
        System.out.printf("Animal is making sound");
    }
}
