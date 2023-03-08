public class Q8_Lab6 {
    //Write a java method to check a string is palindrome or not.
    public static void main(String[] args) {
        String inputString = "Panama";
        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome!");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String inputString) {
        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
