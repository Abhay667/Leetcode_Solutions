package Remove_Vowels_from_a_String;

public class Problem1119Solution7 {
    public static void main(String[] args) {
        StringBuffer result = new StringBuffer();
        String vowels = "aeiouAEIOU";
        String s = "abcdefghi";
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                //System.out.print(c);
                result.append(c);
            }

        }
System.out.print(result);
    }
}


/*
Lintcode solution

public class Solution {

public String removeVowels(String s) {
    StringBuffer result = new StringBuffer();
    String vowels ="aeiouAEIOU";
    for(char c: s.toCharArray())
    {
        //System.out.print(c);
        if(vowels.indexOf(c)==-1)
        {
            // System.out.print(c);
            result.append(c);
        }
    }
    //System.out.print(result);
    return result.toString();
}
}
 */