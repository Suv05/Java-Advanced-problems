import java.util.*;
/*Define a class Phone to store these three parts of a phone number separately as instance
variable (area_code, exchange, number). The class consists of two member methods: input ( )
and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.)
operator and instance variable with value area_code: 212, exchange: 767,
number: 8900), and initialize other from the user through member method input ( ). Display
both the numbers.*/
class phone {
    int area_code, exchange, number;

    public int DisplayAreaCode() {
        return area_code;
    }

    public void inputAreaCode(int area_code) {
        this.area_code = area_code;
    }

    public int DisplayExchange() {
        return exchange;
    }

    public void inputExchange(int exchange) {
        this.exchange = exchange;
    }

    public int DisplayNumber() {
        return number;
    }

    public void inputNumber(int number) {
        this.number = number;
    }
}

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your area_code ");
        int x = sc.nextInt();
        System.out.println("Enter your exchange");
        int y = sc.nextInt();
        System.out.println("Enter your number");
        int z = sc.nextInt();

        phone ph = new phone();
        ph.inputAreaCode(x);
        ph.inputExchange(y);
        ph.inputNumber(z);
        System.out.println("Your phone number is (" + ph.DisplayAreaCode() + ") " + ph.DisplayExchange() +"-"+ ph.DisplayNumber());

    }
}
