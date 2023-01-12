public class Q7_lab2 {
    public static void main(String[] args) {
        //Q-Write a java program that displays the following table. Cast floating-point numbers into
        //integers.
        //a b pow(a, b)
        //1 2 1
        //2 3 8
        //3 4 81
        //4 5 1024
        //5 6 15625

      /* int a = 6;
       for (int b=2;b<=a;b++){
           int c = (i nt) (" "+Math.pow(a,b));
                System.out.printf("%d X %d =%d\n", a, b, c);
       }*/ //THIS is pow table of 6 ,but question is not asking that🥲😋😁😑🙄

        int n1 = 1, n2 = 2, n3 = 3, n4 = 4, n5 = 5;
        int p1 = 2, p2 = 3, p3 = 4, p4 = 5, p5 = 6;
        System.out.println("a"+" b"+" P(a,b)");
        System.out.println(n1+" "+p1+" "+Math.pow(n1,p1));
        System.out.println(n2+" "+p2+" "+Math.pow(n2,p2));
        System.out.println(n3+" "+p3+" "+Math.pow(n3,p3));
        System.out.println(n4+" "+p4+" "+Math.pow(n4,p4));
        System.out.println(n5+" "+p5+" "+Math.pow(n5,p5));



    }
}
