package OOPS;

class Child{
    int height;
    Child(String name,int age){
        System.out.println(name+" is kid of age "+age);
    }
    void details(int height){
        this.height=height;   //refernece to current object
    }
}


public class Constructor {
    public static void main(String[] args) {

        Child One=new Child("krishna",3);

    }
}

