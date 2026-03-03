final class FinalClassExample {
    final int number = 10;

    final void display() {
        System.out.println("Final method. Number: " + number);
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalClassExample obj = new FinalClassExample();
        obj.display();
    }
}