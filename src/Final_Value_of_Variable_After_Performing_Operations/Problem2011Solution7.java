package Final_Value_of_Variable_After_Performing_Operations;

public class Problem2011Solution7 {
    public static void main(String[] args) {
        //String operations[] = {"X++", "++X", "--X", "X--"}; // output should be 0
        String operations[] = {"++X", "++X", "X++"}; // output should be 3
        StringBuilder container = new StringBuilder();
        int x = 0;
        for (String c : operations) {
            // System.out.print(c);
            if ("--X".contentEquals(c) || "X--".contentEquals(c)) {
                x--;

            } else {
                x++;
            }
        }
        System.out.print(x);

/*
In Java, string literals like "++X" are implicitly converted to String objects. So, while "++X" is not a reference to an object in the traditional sense, it behaves as if it were an instance of String for method calls.
 */
    }
}
