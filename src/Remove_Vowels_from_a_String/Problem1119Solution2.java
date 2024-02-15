package Remove_Vowels_from_a_String;// lintCode solution
import java.util.HashSet;


class Solution {
    /**
     * @param s: The string before remove vowels
     * @return: The string after remove vowels
     */
    StringBuilder result = new StringBuilder();
    HashSet <Character> vowels = new HashSet<>();

    public String removeVowels(String s) {

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

        for(Character c: s.toCharArray())//()
        {
            //System.out.println(c);

            if(!vowels.contains(c))
            {
                //System.out.println(c);
                result.append(c);
            }
        }
        //return "hi";
        return result.toString();
    }
}