/*Define a class called product. Two instance variables of the class are pid (product-id) and
price (product price). It consists of one static variable tot_price (total price). Initialize the value
of instance variables through parameterized constructor. It consists of a display ( ) method to
display the value of instance variables. A person went to market and purchase 5 different
products. Using the above-mentioned class, display the details of products that the person has
purchased. Also, determine how much total amount the person will pay for the purchase of 5
products.*/

import java.util.*;

class product {
    static int tot_price;
    int pid;
    int price;

    public product(int pid, int price) {
        this.pid = pid;
        this.price = price;
    }

    public void display() {
        System.out.println(pid + " \t " +" \t " +price);
    }
}

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        product[] po = new product[5];

        po[0] = new product(110, 45);
        po[1] = new product(111, 98);
        po[2] = new product(112, 75);
        po[3] = new product(113, 65);
        po[4] = new product(114, 100);
        System.out.println("Product-Id\t "+"price ");
        for (product element : po) {
            element.display();
        }

        System.out.println("Total price pay by the person to purchase these--> ");

    }
}
