package StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population;

    static void message(){
        System.out.println("Hello World !");
//        System.out.println(this.age); We can't use this here because static things doesn't
//        dependent on object it is a part of class and "this" belongs to object so we get error
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;
    }
}
