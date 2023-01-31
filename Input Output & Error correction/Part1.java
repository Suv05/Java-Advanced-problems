public class Part1 {
    public static void main(String[] args) {
        //Q1-
        // System.out.println(System.out.println("hi"));

        //Q4-
        //System.out.print(013 + 1.94 + "C" + "S");
        //Here 013 is the octal of Decimal 11.Decimal-> Octal Integer.toOctalString(int num)
        //Also see the octal to decimal conversion ❤️🫡


        //Q3-
//        int a=2,b=5,c;
//        a=a*a++ - --a;   //You are right a=2 and b=5 & c=-1...😉😋
//        c=b++ - b--;
//        System.out.println("a="+a+",b="+b+",c="+c);
//        System.out.println(a++ + ++a * a--); //After a value calculation it follows priority
//        System.out.println(b=b++ * b--);
//        System.out.println("a="+a+",b="+b+",c="+c);


        //Q2-
        int a, b, c;
        a=-3+2*7-4; //2*7=14,14-3=11,11-4=7....left to right highest precedence *
        b=a*8+4%5-6;
        c=a+b*3-2%5-4;
        System.out.println(a+" "+b+" "+c);




    }
}

