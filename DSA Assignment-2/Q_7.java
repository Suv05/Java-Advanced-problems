/*Define a base class Person with instance variable name, age. The instance variables are
initialized through constructors. The prototype of constructor is as below.
Person (string, int)
Define a derived class Employee with instance variables Eid, salary. The instance variables
are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double). Another instance method of Employee class is empDisplay()
to display the information of employee details*/

class Person{
    String name;
    int age;

    //Person(){};//Jadi default constructor na rahiba then super decalre kariba
    Person(String n, int m) {
        this.name = n;
        this.age = m;
    }
}

class Employee extends Person{
    int eid;
    double salary;

    Employee(String name, int age, int eid, double salary) {
        super(name,age);
        this.name = name;
        this.age = age;
        this.eid = eid;
        this.salary = salary;
    }

   void empDisplay(){
       System.out.println("Name:- \t" + name);
       System.out.println("Age:- \t" + age);
       System.out.println("Eid:- \t" + eid);
       System.out.println("Salary:- " + salary);

   }

}
public class Q_7 {
    public static void main(String[] args) {
        Employee e = new Employee("suv", 19, 22441897, 455666.00);
        e.empDisplay();
    }
}
