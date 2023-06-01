/*Define a class Phone to store these three parts of a phone number separately as instance
variable (area_code, exchange, number). The class consists of two member methods: input ( )
and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.)
operator and instance variable with value area_code: 212, exchange: 767,
number: 8900), and initialize other from the user through member method input ( ). Display
both the numbers.*/
import java.util.Scanner;

class Phone {
    private int areaCode;
    private int exchange;
    private int number;

    public Phone(int areaCode, int exchange, int number) {
        this.areaCode = areaCode;
        this.exchange = exchange;
        this.number = number;
    }

    public Phone() {
        input();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area code: ");
        areaCode = scanner.nextInt();
        System.out.print("Enter exchange: ");
        exchange = scanner.nextInt();
        System.out.print("Enter number: ");
        number = scanner.nextInt();
    }

    public void display() {
        System.out.println("(" + areaCode + ") " + exchange + "-" + number);
    }
}

public class Q_1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone(212, 767, 8900);
        Phone phone2 = new Phone();

        System.out.print("My number is ");
        phone1.display();
        System.out.print("Your number is ");
        phone2.display();
    }
}
