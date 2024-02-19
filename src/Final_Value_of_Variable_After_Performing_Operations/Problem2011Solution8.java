package Final_Value_of_Variable_After_Performing_Operations;

public class Problem2011Solution8 {
    public static void main(String[] args) {
        String operations[] = {"X++", "++X", "--X", "X--"}; // output should be 0
        // String operations[] = {"++X", "++X", "X++"}; // output should be 3
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];
            if (s.charAt(1) == '-') {
                x--;
            } else if (s.charAt(1) == '+') {
                x++;
            }
        }
        System.out.print(x);
    }
}
