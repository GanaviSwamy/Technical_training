public class ReverseStringDemo {
    public static void main(String[] args) {
        String original = "Bhavana";
        StringBuilder sb = new StringBuilder(original);
        System.out.println("Reversed: " + sb.reverse());
    }
}