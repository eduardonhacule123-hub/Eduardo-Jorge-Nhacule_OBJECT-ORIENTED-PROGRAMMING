public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Generic Person", "P000");
        Student p2 = new Student("Ali", "S001");
        Lecturer p3 = new Lecturer("Dr Ahmad", "L100");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}