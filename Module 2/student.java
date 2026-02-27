public class Student {

    int rollNo;
    String name;
    double marks;

    Student() {
        rollNo = 0;
        name = "Unknown";
        marks = 0.0;
    }

    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Rahul", 85.5);

        s1.display();
        s2.display();
    }
}