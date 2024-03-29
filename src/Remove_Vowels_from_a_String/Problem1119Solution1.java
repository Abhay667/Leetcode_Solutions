package Remove_Vowels_from_a_String;

import java.util.HashSet;

public class Problem1119Solution1 {
    public static String Remove(String s) {
        StringBuffer result = new StringBuffer();
        HashSet<Character> vowels = new HashSet<>();
        // inserting vowels in HashSet
        vowels.add('A');// vowels.add("A")
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for (char ch : s.toCharArray()) {
            //System.out.println(ch);
            if(!vowels.contains(ch))
            {
                result.append(ch);
            }
        }
return result.toString();
    }


    public static void main(String[] args) {
        String s = "abcdefghi";

        System.out.println(Remove(s));
    }
}
