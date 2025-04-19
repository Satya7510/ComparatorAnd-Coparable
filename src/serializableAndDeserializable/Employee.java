package serializableAndDeserializable;

import java.io.*;

public class Employee implements Serializable {
    private String name;
    private int age;

    public Employee(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}

class Example{
    public static void main(String[] args) throws Exception {
        Employee std1=new Employee("Test",30);
        FileOutputStream fos=new FileOutputStream("D:/my_work");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(std1);
        FileInputStream fis=new FileInputStream("D:/my_work");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Employee std2=(Employee) ois.readObject();
        System.out.println("Name :"+std2.getName());
        System.out.println("Age :"+std2.getAge());
    }
}
