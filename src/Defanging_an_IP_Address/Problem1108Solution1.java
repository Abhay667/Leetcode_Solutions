package Defanging_an_IP_Address;

public class Problem1108Solution1 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        StringBuffer result = new StringBuffer();
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
leetcode solution:-
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for (char c : address.toCharArray()) {
            //System.out.print(c);
            if(c=='.')
            // agar character '.' ye ataa hai to StringBuffer mai [.] ye append kar do
            {
                result.append("[.]");
            }
            else
            {
                result.append(c);
                // nahi to vahi character StringBuffer mai add kar do
            }


        }
        //System.out.print(result);
      return  result.toString();
//return "hi";
    }
}
 */