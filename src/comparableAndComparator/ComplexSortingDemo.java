package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComplexSortingDemo {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("aman",3.56,111));
        students.add(new Student("Aaman",3.58,112));
        students.add(new Student("Cman",3.60,114));
        students.add(new Student("Dman",3.62,116));
        students.add(new Student("Eman",3.64,118));

        System.out.println("Unsorted list of student");

        for(Student student:students){
            System.out.println(student);
        }

        Comparator<Student>complexComparator=Comparator
                .comparing(Student::getGpa,Comparator.reverseOrder())
                .thenComparing(Student::getName)
                .thenComparing(Student::getRegNo);
        Collections.sort(students,complexComparator);

        System.out.println("Sorted list of Student");

        for(Student student:students){
            System.out.println(student);
        }
    }
}
