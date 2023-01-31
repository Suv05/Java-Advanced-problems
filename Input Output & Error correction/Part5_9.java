public class Part5_9 {
    public static void main(String[] args) {
        //Q-5
        //System.out.println('A'+"av"); Example that 'char'+"String" always string

        System.out.println(2+3+"bc"+'c'+'a'); //5bcca....1st str then char
        System.out.println('c'+'a'+2+3+"bc"); //201bc...1st char then str
        System.out.println("bc"+'c'+'a'+2+3); //bcca23...1st str then char
        System.out.println("bc"+('c'+'a')+(2)+3); //bc19623...char within ()...

    }
}
