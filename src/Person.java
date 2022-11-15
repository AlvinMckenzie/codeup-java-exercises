import java.util.Scanner;

public class Person {

    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + getName() + "!");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Adam", 30);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        person1.sayHello();

        Person person2 = new Person("Evee", 28);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        person2.setAge(29);
        System.out.println(person2.getAge());
        person2.sayHello();
    }


}
