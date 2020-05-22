package OOPS;

public class Student extends Person{

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void getName(){ System.out.println(name); }
    public void getAge() {
        System.out.println(age);
    }
}
