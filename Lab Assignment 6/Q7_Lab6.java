public class Q7_Lab6 {
    //Write java method called count accepts a string as input and returns the number of vowels in
    //it. The method header is given below.

    //For example, count ("Welcome") returns 2.
    public static void main(String[] args) {
        String inputString = "Hello, world! by Suva m";
        int vowelCount = countVowels(inputString);
        System.out.println("The number of vowels in the input string is " + vowelCount);

    }

    public static int countVowels(String inputString) {
        int vowelCount = 0;
        String vowels = "aeiouAEIOU"; // A string containing all vowels in uppercase and lowercase

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
