package Remove_Vowels_from_a_String;

public class Problem1119Solution5 {

    public static void main(String[] args) {
        String s = "abcdefghij";
        System.out.println(result(s));
    }


    public static String result(String s) {
        StringBuffer result = new StringBuffer();


        for (char c : s.toCharArray()) {
            //System.out.print(c);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                result.append(c);
            }
        }


        return result.toString();
    }
}

//lintcode 3631
//public class Solution {
//    /**
//     * @param s: The string before remove vowels
//     * @return: The string after remove vowels
//     */
//    public String removeVowels(String s) {
//        StringBuffer result = new StringBuffer();
//        for(char c : s.toCharArray())
//        {
//            //System.out.print(c);
//            if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'))
////fasle --> !false --> true
//
////System.out.print(c);
//                result.append(c);
//        }
//        //return "hi";
//        return result.toString();
//    }
//}