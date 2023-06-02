/*Initialize the instance variables Principal, Time, rate through constructors. Constructors are
overloaded with the following prototypes.
Constructor1: Deposit ( )
Constructor2: Deposit (long, int, double)
Constructor3: Deposit (long, int)
Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are (i) display ( ): to display the
value of instance variables, (ii) calc_amt( ) to calculate the total amount.
Total_amt = Principal + (Principal×rate×Time)/100;*/
class Deposit {
    long principal;
    int time;
    double rate;
    double total_amount;

    /*A lot of people mix up the default constructor for the no-argument constructor,
    but they are not the same in Java. Any constructor created by the programmer is not considered
    a default constructor in Java.*/

    //no argument constructor not default
    public Deposit() {}

    public Deposit(long principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    public Deposit(long principal, int time) {
        this.principal = principal;
        this.time = time;
    }

    public Deposit(long principal, double rate) {
        this.principal = principal;
        this.rate = rate;
    }

    public void display() {
        System.out.println("Principal:- "+principal+" Time:- "+time+" Rate:- "+rate);
    }

    public double calc_amt() {
        total_amount= principal + (principal*rate*time)/100;
        return total_amount;
    }
}

public class Q_5 {
    public static void main(String[] args) {
        Deposit d = new Deposit(1452245,12,6.5);
        d.display();
        System.out.println("Here is the total amount "+ d.calc_amt());

    }
}
