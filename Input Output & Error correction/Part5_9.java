public class Part5_9 {
    public static void main(String[] args) {
        //Q-5
        //System.out.println('A'+"av"); Example that 'char'+"String" always string

//        System.out.println(2+3+"bc"+'c'+'a'); //5bcca....1st str then char
//        System.out.println('c'+'a'+2+3+"bc"); //201bc...1st char then str
//        System.out.println("bc"+'c'+'a'+2+3); //bcca23...1st str then char
//        System.out.println("bc"+('c'+'a')+(2)+3); //bc19623...char within ()..

        //Q-6
        int x = -5;
        System.out.println(x >> 1);
        int y = 120;
        System.out.println(y >> 1);//but +ve can sift till 0

        //Q-7
        System.out.println(10 + 15 + "Hello");
        System.out.println("Hello" + 10 + 15);

        //Q-8
//        byte b = 10;
//        b =  b + 10;   //Here it shows error bcz it has to convert in byte type...
//        System.out.println(b);

        //Q-9
        int i = 4;
        int j = 21;
        int k = ++i * 7 + 2 - j--;  //++4= 5,5*7=35+2=37, 37-21=16,
        System.out.println("k = " + k);
    }
}
