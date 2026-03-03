class StudentCounter {
    static int count = 0;
    String name;

    StudentCounter(String name) {
        this.name = name;
        count++;
    }

    static void displayCount() {
        System.out.println("Total Students: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        new StudentCounter("Asha");
        new StudentCounter("Rahul");

        StudentCounter.displayCount();
    }
}