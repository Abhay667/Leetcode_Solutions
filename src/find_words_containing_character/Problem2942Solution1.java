package find_words_containing_character;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Problem2942Solution1 {
    public static void main(String[] args) {
        String[] words ={"leet","code"};
        HashSet result = new HashSet();

        StringBuilder contain = new StringBuilder();

        char s='e';
        int ArrayLength=words.length;
        for(int i=0;i<ArrayLength;i++)
        {
            String c=words[i];
            //System.out.println(c);

            for(char d:c.toCharArray())
            {
                if(c.indexOf(d)>-1)
                {
                    //System.out.print(i);
                    result.add(i);
                }
            }
        }
//System.out.print(result);
        List <Integer> result1 = new ArrayList<>(result);
        System.out.print(result1);

    }
}
