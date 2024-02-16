package Remove_Vowels_from_a_String;

public class Problem1119Solution6 {
    public static void main(String[] args) {


        String s = "abcdefghi";
        System.out.print(Remove(s));

    }

    public static String Remove(String s) {

        StringBuffer result = new StringBuffer();
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray()) {
//System.out.print(c);
            if (!(vowels.indexOf(c) >= 0)) {

                //System.out.print(c);
                result.append(c);

            }
        }
        // System.out.print(result);
        return result.toString();
    }
}


//-----------------------------------------------------------------------------------------------------------
/* vowels.indexOf(c)
 s mai jo vowels ke characters hai bo s ke kis index par hai
 means kidhar exist karte hai aeiouAEIOU String s mai
*/
//------------------------------------------------------------------------------------------------------------
                /*
                if(vowels.indexOf(c) >= 0)
                {
                 System.out.print(c);
                }
                1. bo saare characters print kar do jo ki vowels baale String s mai hai
                2. index humne >= 0 liya hai kyoki 's' mai first char (0 index par) hai
                3. this will print all vowels

                 */
//-------------------------------------------------------------------------------------------------------------
/*
if(false)-->>menas grater than 0 nahi hai jo ki non vowels hai
unko print karna hai
 means we have to make that if(false)-> if(true) taaki non vowels print ho sake

 */

/*
Lintcode 3631 · Remove Vowels From String
 */




/*
public class Solution {

    public String removeVowels(String s) {
        StringBuffer result = new StringBuffer();
        String vowels ="aeiouAEIOU";
        for(char c:s.toCharArray())
        {
            if(!(vowels.indexOf(c)>=0))
            {
                //System.out.print(c);
                result.append(c);

            }

            //System.out.print(c);
        }
        // write your code here
        return result.toString();
    }
}
*/