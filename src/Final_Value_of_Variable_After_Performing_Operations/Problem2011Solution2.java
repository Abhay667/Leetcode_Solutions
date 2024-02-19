package Final_Value_of_Variable_After_Performing_Operations;

public class Problem2011Solution2 {
    public static void main(String[] args) {
        //String operations[]={"X++","++X","--X","X--"}; // output should be 0
        String operations[] = {"++X", "++X", "X++"}; // output should be 3
        int x = 0;
        for (String c : operations) {
            //System.out.print(c);
            if (c.equals("++X")) {
                x = x + 1;
            }
            if (c.equals("X++")) {
                x = x + 1;
            }
            if (c.equals("--X")) {
                x = x - 1;
            }
            if (c.equals("X--")) {
                x = x - 1;
            }
        }
        System.out.print(x);
    }
}
