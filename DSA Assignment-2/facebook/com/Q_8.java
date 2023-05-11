/*Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member max count, instance member name & method display ( ) to display
name of a person, count the no. of characters present in the name of the person.*/
package facebook.com;

interface DetailInfo {
    void display();

    int count();
}

class Person implements DetailInfo {
    static int maxCount = 100; // static data member
    String name; // instance member

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public int count() {
        return name.length();
    }
}

public class Q_8 {
    public static void main(String[] args) {
        Person p = new Person("John Smith");
        p.display();
        System.out.println("Number of characters in the name: " + p.count());
    }
}
