package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorDemo {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();

        students.add(new Student("Satya",4.22,109));
        students.add(new Student("Manish",4.22,110));
        students.add(new Student("Aatya",4.23,111));
        students.add(new Student("Jassi",4.26,112));
        students.add(new Student("Natya",4.28,114));

        Collections.sort(students,(s1,s2)->s1.getRegNo()-s2.getRegNo());

        System.out.println("Student sorted based on the Resitered Number :");

        for(Student student:students){
            System.out.println(student);
        }

        Collections.sort(students, Comparator.comparing(Student::getName));

        System.out.println("Student sorted based on the Name :");

        for(Student student:students){
            System.out.println(student);
        }

    }
}
