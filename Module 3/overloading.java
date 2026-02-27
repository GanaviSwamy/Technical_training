 class OverloadingExample {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class OverridingExample {

    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends OverridingExample {

    void show() {
        System.out.println("Child class method");
    }
}

public class OverloadOverrideDemo {
    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5, 10, 15));

        OverridingExample ref = new Child();
        ref.show();
    }
}