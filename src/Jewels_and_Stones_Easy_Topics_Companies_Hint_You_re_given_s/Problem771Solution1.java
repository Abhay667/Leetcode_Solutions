package Jewels_and_Stones_Easy_Topics_Companies_Hint_You_re_given_s;

import java.util.HashSet;

public class Problem771Solution1 {
    public static void main(String[] args) {
        String j="aA";String stones = "aAAbbbb"; //output should be 3
        //String j="z";String stones ="ZZ"; //output should be 0
int x=0;
        HashSet<Character>  Jewels = new HashSet<>();
        for(char c: j.toCharArray())
        {
        Jewels.add(c);
        }
        for(char c: stones.toCharArray())
        {
            if(Jewels.contains(c))
            {
                //System.out.println(c);
                x++;
            }

        }
        System.out.print(x);


    }
}
/*
1.Remember HashSet contains following methods:-
2. add();
3.contains();
 */