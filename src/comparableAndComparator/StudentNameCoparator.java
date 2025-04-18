package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentNameCoparator {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Aman",4.22,102));
        students.add(new Student("Ajay",4.23,104));
        students.add(new Student("Santosh",4.24,105));
        students.add(new Student("Raju",4.26,106));
        students.add(new Student("Jassi",4.28,108));

        System.out.println("Unsorted Student List :");

        for(Student student:students){
            System.out.println(student);
        }

        Collections.sort(students,new ComparatorDemo());

        System.out.println("sorted Student List :");

        for(Student student:students){
            System.out.println(student);
        }
    }
}
