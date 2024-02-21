package Jewels_and_Stones_Easy_Topics_Companies_Hint_You_re_given_s;

public class Problem771Solution3 {
    public static void main(String[] args) {
        String jewel="aA";String stones = "aAAbbbb"; //output should be 3
        //String jewel = "z";String stones = "ZZ"; //output should be 0
        boolean[] compare = new boolean[128];
        int count=0;
        for (char c : jewel.toCharArray()) {
            compare[c] = true;
        }
        for (char c : stones.toCharArray()) {
            if(compare[c])
            {
                System.out.print(c);

            }
        }
    }
}
