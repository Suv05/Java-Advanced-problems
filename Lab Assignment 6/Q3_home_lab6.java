public class Q3_home_lab6 {
    public static void displayMiddleChar(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty!");
            return;
        }

        int length = input.length();
        int middleIndex = length / 2;
        if (length % 2 == 0) {
            // string length is even, print second middle character
            System.out.println("Middle characters: " + input.charAt(middleIndex) + input.charAt(middleIndex - 1));
        } else {
            // string length is odd, print middle character
            System.out.println("Middle character: " + input.charAt(middleIndex));
        }
    }

//    String input = "Hello";
//    displayMiddleChar(input); // prints "Middle character: l"
//
//    input = "World";
//    displayMiddleChar(input); // prints "Middle characters: rl"

}
