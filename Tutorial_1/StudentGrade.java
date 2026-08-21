
public class StudentGrade {
    public static void main(String[] args) {
        String studentName = "Ali";
        int marks = 85;
        char grade;

        if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Student Name : " + studentName);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + grade);
    }
}