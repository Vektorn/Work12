package Task2;

public class Programa {
    public static int number = 0;
    public Programa(int number) {
        this.number = number;
    }
    public static void main(String[] args) throws InterruptedException {
        Programa Count = new Programa(29);
        for(int i = 1; i<= number; i++) {
            A a = new A(i);
            a.start();

            B b = new B(i);
            b.start();
            b.join();

            C c = new C(i);
            c.start();
            c.join();

            D d = new D(i);
            d.start();
            d.join();
        }
    }
    public static void fizz(Integer numb) {
        try {
            if (numb % 3 == 0 && numb % 5 != 0) {
                System.out.print("fizz ");
            }
        } catch (NumberFormatException e) {
            System.out.println("НЕ ЧИСЛО");
        }
    }
    public static void buzz(Integer numb) {
        try {
            if (numb % 5 == 0 && numb % 3 != 0) {
                System.out.print("buzz ");
            }
        } catch (NumberFormatException e) {
            System.out.println("НЕ ЧИСЛО");
        }
    }
    public static void fizzbuzz(Integer numb) {
        try {
            if (numb % 3 == 0 && numb % 5 == 0) {
                System.out.print("fizzbuzz ");
            }
        } catch (NumberFormatException e) {
            System.out.println("НЕ ЧИСЛО");
        }
    }
    public static void number(Integer numb) {
        try {
            if (numb % 3 != 0 && numb % 5 != 0) {
                System.out.print(numb + " ");
            }
        } catch (NumberFormatException e) {
            System.out.println("НЕ ЧИСЛО");
        }
    }
}