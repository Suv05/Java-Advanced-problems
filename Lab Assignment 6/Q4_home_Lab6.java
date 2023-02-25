public class Q4_home_Lab6 {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }
//    String input = "Hello, how are you today?";
//    int numWords = countWords(input);
//System.out.println(numWords); // prints 5

}
