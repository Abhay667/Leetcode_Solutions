import java.util.HashSet;
public class Problem1119Solution3 {
    public static String Remove(String s) {
        char c ;
        StringBuffer result = new StringBuffer();
        int length= s.length();
        for(int i =0; i<length;i ++)
        {
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
        {


        }
        else {
            //System.out.print(s.charAt(i));
            result.append(s.charAt(i));
        }


        }
        return result.toString();
    }


    public static void main(String[] args) {
        String s = "abcdefghi";

        System.out.println(Remove(s));
    }
}
//
//3631 · Remove Vowels From String
//Lintcode Solution:-
//public class Solution {
//    /**
//     * @param s: The string before remove vowels
//     * @return: The string after remove vowels
//     */
//    StringBuilder result = new StringBuilder();
//
//
//    public String removeVowels(String s) {
//        int length=s.length();
//        for(int i=0;i<length;i++)
//        {
//            //System.out.print(s.charAt(i));
//            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
//            {
////System.out.print(s.charAt(i));
//            }
//            else
//            {
//                result.append(s.charAt(i));
//            }
//        }
//
//        return result.toString();
//    }
//
//    //return result.toString();
//}
