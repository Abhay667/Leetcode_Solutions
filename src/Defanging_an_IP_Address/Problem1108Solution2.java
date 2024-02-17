package Defanging_an_IP_Address;

public class Problem1108Solution2 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        StringBuilder result = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                result.append("[.]");
            } else {
                result.append(c);
            }
        }
        System.out.print(result);
    }
}


/*
leetcode solution
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        // yaha par hum StringBuffer ki jagah StringBuilder use kar rahe hai
        for (char c : address.toCharArray()) {
            if (c == '.') {
                result.append("[.]");

            } else {
                result.append(c);
            }
            // System.out.print(c);
        }
        System.out.print(result);

        return result.toString();
    }
}
 */