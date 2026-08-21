class Student {

    // Attributes
    String name;
    int age;
    double gpa;

    // Constructor
    Student(String studentName, int studentAge, double studentGpa) {
        name = studentName;
        age = studentAge;
        gpa = studentGpa;
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    // Another Method
    public void study() {
        System.out.println(name + " is studying.");
    }

    // Yet Another Method
    public void takeExam() {
        System.out.println(name + " is taking an exam.");
    }
}