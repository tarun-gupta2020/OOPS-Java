package OOPS;
class Person{
    String name;
    int age;
    void eat(){
        System.out.println(name+" is eating");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Person p=new Student();
        Student s=new Student();

        s.name="Tarun";
        s.age=23;
        s.eat();
        s.getAge();
        s.getName();

    }
}
