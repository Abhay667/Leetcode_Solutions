package Remove_Vowels_from_a_String;

public class Problem1119Solution4 {


    public  static String remove(String s)
    {
        StringBuffer result = new StringBuffer();
        int length= s.length();
        for(int i =0;i<length;i++)
        {
            if(s.charAt(i)!='a'&& s.charAt(i)!='e' && s.charAt(i)!='i'&& s.charAt(i)!='o'&& s.charAt(i)!='u' )
            {
               result.append(s.charAt(i));
//System.out.println(s.charAt(i));

            }
            else {

            }

        }
        //System.out.println(result.toString());
        //return result.toString();
return result.toString();
    }


    public static void main(String[] args) {
    String s;
    s= "abcdefaaag";
    System.out.println(remove(s));

    }
}

//Lintcode
//3631 · Remove Vowels From String
//
//public class Remove_Vowels_from_a_String.Solution {
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
//            if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i'&& s.charAt(i)!='o'&& s.charAt(i)!='u')
//            {
//                result.append(s.charAt(i));
////System.out.print(s.charAt(i));
//            }
//            else
//            {
//
//            }
//        }
//
//        return result.toString();
//    }
//
//    //return result.toString();
//}
