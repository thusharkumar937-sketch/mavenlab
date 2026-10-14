public class App {

    public String checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        App obj = new App();

        System.out.println(obj.checkEvenOdd(8));
        System.out.println(obj.checkEvenOdd(7));
    }
}