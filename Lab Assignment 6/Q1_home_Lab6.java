//public class Q1_home_Lab6 {
//    public class FirstNonRepeatedCharacter {
//        public static Character findFirstNonRepeatedCharacter(String str) {
//            if (str == null || str.isEmpty()) {
//                return null;
//            }
//
//            Map<Character, Integer> charCountMap = new LinkedHashMap<>();
//
//            // count the occurrence of each character in the string
//            for (char c : str.toCharArray()) {
//                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//            }
//
//            // find the first non-repeated character in the string
//            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//                if (entry.getValue() == 1) {
//                    return entry.getKey();
//                }
//            }
//
//            return null;
//        }
//
//        public static void main(String[] args) {
//            String str = "Java";
//            Character firstNonRepeatedChar = findFirstNonRepeatedCharacter(str);
//            System.out.println("First non-repeated character in " + str + " is " + firstNonRepeatedChar);
//
//            str = "Hello World";
//            firstNonRepeatedChar = findFirstNonRepeatedCharacter(str);
//            System.out.println("First non-repeated character in " + str + " is " + firstNonRepeatedChar);
//        }
//    }
//
//}
