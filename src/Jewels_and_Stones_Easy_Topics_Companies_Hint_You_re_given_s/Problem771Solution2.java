package Jewels_and_Stones_Easy_Topics_Companies_Hint_You_re_given_s;

public class Problem771Solution2 {
    public static void main(String[] args) {
        //String jewel="aA";String stones = "aAAbbbb"; //output should be 3
        String jewel="z";String stones ="ZZ"; //output should be 0
        int count =0;
        // jewel.indexOf(stones(aAA))
        for(char c: stones.toCharArray())
        {
            //System.out.print(c);
            if(jewel.indexOf(c)>=0)
            {
                //System.out.print(c);
                count++;
            }
        }
        System.out.print(count);

    }
}
