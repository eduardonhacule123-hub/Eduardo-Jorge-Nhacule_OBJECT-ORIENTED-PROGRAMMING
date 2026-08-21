public class Lecturer extends Employee {

    private String subject;
    private String department;

    public Lecturer(String id, String name, String subject, String department) {
        super(id, name);
        this.subject = subject;
        this.department = department;
    }

    public void displaySubject() {
        System.out.println("Subject : " + subject);
    }

    public void displayDepartment() {
        System.out.println("Department : " + department);
    }
}