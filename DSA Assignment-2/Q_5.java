/*Principal Long
  Time Integer
  rate Double
  Total_amt Double*/
class Deposit {
    long principal;
    int time;
    double rate;
    double total_amount;

    /*A lot of people mix up the default constructor for the no-argument constructor,
    but they are not the same in Java. Any constructor created by the programmer is not considered
    a default constructor in Java.*/

    //no argument constructor not default
    public Deposit() {
    }

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

    public void calc_amt() {
        System.out.println(principal + (principal*rate*time)/100);
    }
}

public class Q_5 {
    public static void main(String[] args) {

    }
}
