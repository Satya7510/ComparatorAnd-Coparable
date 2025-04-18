package comparableAndComparator;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();
        students.add(new Student("satya",4.44,129));
        students.add(new Student("manish",4.23,101));
        students.add(new Student("Harsha",3.96,108));
        students.add(new Student("Ajay",3.96,100));

        System.out.println("Unsorted Student List :");

        Collections.sort(students);

        for(Student student:students){
            System.out.println(student);
        }

        System.out.println("Sorted student List : ");

        for(Student student:students){
            System.out.println(student);
        }

    }
}
