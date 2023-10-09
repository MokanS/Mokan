package HomeworkNr7;

abstract class Person {
    String name;
    Person(String name){
        this.name=name;
    }
}
class Employee extends Person{
    Employee(String name){
        super(name);
    }
}
abstract class Worker extends Employee{
    Worker(String name){
        super(name);
    }
    abstract void work();
}
class Manager extends Worker {
    Manager(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + "manage the team");
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan");
        Manager manager1 = new Manager("Serghei");
        Manager manager2 = new Manager("Dmitrii");
        manager1.work();
        manager2.work();
        Person[] people = new Person[]{employee1, manager1, manager2};
        for (Person person : people) {
            if (person instanceof Manager) {
                Manager manager = (Manager) person;
                manager.work();
            }
        }
    }
}