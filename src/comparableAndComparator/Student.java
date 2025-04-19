package comparableAndComparator;

public class Student implements Comparable<Student> {
    private final String name;
    private final double gpa;
    private final int regNo;

    public Student(String name,double gpa,int regNo){
        this.name=name;
        this.gpa=gpa;
        this.regNo=regNo;
    }

   @Override
   public int compareTo(Student other){
        if(this.gpa< other.gpa){
            return -1;
        }
        else if(this.gpa>other.gpa){
            return 1;
        }
        else{
            return 0;
        }
   }



    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }



    public int getRegNo() {
        return regNo;
    }

    @Override
    public String toString(){
       return name +",GPA: "+gpa+", Reg No: "+regNo;
    }
}
