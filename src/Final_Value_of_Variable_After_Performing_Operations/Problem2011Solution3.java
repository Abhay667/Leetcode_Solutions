package Final_Value_of_Variable_After_Performing_Operations;

public class Problem2011Solution3 {
    public static void main(String[] args) {
        //String operations[]={"X++","++X","--X","X--"}; // output should be 0
        String operations[] = {"++X", "++X", "X++"}; // output should be 3
        int x = 0;

        for (String c : operations) {
            if (c.equals("++X")) {
                x = x + 1;
            } else if (c.equals("X++")) {
                x = x + 1;
            } else if (c.equals("--X")) {
                x = x - 1;
            } else if (c.equals("X--")) {
                x = x - 1;
            }
        }
        System.out.print(x);
    }
}
