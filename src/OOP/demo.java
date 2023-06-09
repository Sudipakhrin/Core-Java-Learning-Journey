package OOP;

public class demo {

    public static void main(String[] args) {
        Student std1;
        std1 = new Student();

        std1.studentId =1;
        std1.studentCity= "Banepa";
        std1.studentName = "Sudeep";

        std1.showFullDetails();
    

        Student std2;
        std2 = new Student(12);
        std2.studentId = 2;
        std2.studentCity="ktm";
        std2.studentName= "Tamang";

        std2.showFullDetails();
    }
}
