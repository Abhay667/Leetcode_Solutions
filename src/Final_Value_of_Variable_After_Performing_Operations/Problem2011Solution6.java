package Final_Value_of_Variable_After_Performing_Operations;

import java.util.HashSet;

public class Problem2011Solution6 {
    public static void main(String[] args) {

        StringBuffer container = new StringBuffer(4);

        String operations[]={"X++","++X","--X","X--"}; // output should be 0
        //String operations[] = {"++X", "++X", "X++"}; // output should be 3
        int x = 0;
        for (String c : operations) {
            //System.out.print(c);
            container.append(c);

        }
        //System.out.print(container);
        for (String c : operations) {
            if ("++X".contentEquals(c) || "X++".contentEquals(c)) {
                x += 1;
            } else {
                x -= 1;
            }
        }
        System.out.print(x);
    }
}
