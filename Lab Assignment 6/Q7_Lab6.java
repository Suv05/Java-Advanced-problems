public class Q7_Lab6 {
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
//    String inputString = "Hello, world!";
//    int vowelCount = countVowels(inputString);
//System.out.println("The number of vowels in the input string is " + vowelCount);

}
