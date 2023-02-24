public class Q8_Lab6 {
    public static boolean isPalindrome(String inputString) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanString = inputString.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int i = 0;
        int j = cleanString.length() - 1;

        while (i < j) {
            if (cleanString.charAt(i) != cleanString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
//    String inputString = "A man, a plan, a canal: Panama";
//if (isPalindrome(inputString)) {
//        System.out.println(inputString + " is a palindrome!");
//    } else {
//        System.out.println(inputString + " is not a palindrome.");
//    }

}
