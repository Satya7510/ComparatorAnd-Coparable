package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseOrderDemo {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("aman",3.56,111));
        students.add(new Student("Aaman",3.58,112));
        students.add(new Student("Cman",3.60,114));
        students.add(new Student("Dman",3.62,116));
        students.add(new Student("Eman",3.64,118));

        System.out.println("Unsorted students List :");

        for(Student student:students){
            System.out.println(student);
        }

        Comparator<Student>byGpa=Comparator.comparing(Student::getGpa);
        Comparator<Student>byGpaReversed= Collections.reverseOrder(byGpa);

        Collections.sort(students,byGpaReversed);

        System.out.println("Sorted students List :");

        for(Student student:students){
            System.out.println(student);
        }

    }
}
