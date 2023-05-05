/*Define a class called product. Two instance variables of the class are pid (product-id) and
price (product price). It consists of one static variable tot_price (total price). Initialize the value
of instance variables through parameterized constructor. It consists of a display ( ) method to
display the value of instance variables. A person went to market and purchase 5 different
products. Using the above-mentioned class, display the details of products that the person has
purchased. Also, determine how much total amount the person will pay for the purchase of 5
products.*/

class Product {
    static double tot_price = 0; // Total price of all products purchased
    int pid; // Product ID
    double price; // Product price

    public Product(int pid, double price) {
        this.pid = pid;
        this.price = price;
        tot_price += price;
    }

    public void display() {
        System.out.println("Product ID: " + pid + ", Product Price: " + price);
    }
}

public class Q_4 {
    public static void main(String[] args) {
        // Creating objects of Product class
        Product p1 = new Product(1, 10.5);
        Product p2 = new Product(2, 20.75);
        Product p3 = new Product(3, 5.99);
        Product p4 = new Product(4, 15.0);
        Product p5 = new Product(5, 8.49);

        // Displaying the details of purchased products
        System.out.println("Details of purchased products:");
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();

        // Displaying the total price of purchased products
        System.out.println("Total price of purchased products: " + Product.tot_price);
    }
}
