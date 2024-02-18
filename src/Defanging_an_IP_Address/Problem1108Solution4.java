package Defanging_an_IP_Address;

public class Problem1108Solution4 {
    public static void main(String[] args) {
        String original="1.1.1.1";
        String updated ;
        updated= original.replaceAll("\\.","[.]");
        System.out.print(updated);
    }
}
/*
leetcode solution:-
class Solution {
    public String defangIPaddr(String address) {

        String updated = address.replaceAll("\\.","[.]");

        //System.out.print(updated);
        //return "hi;
        return updated;
    }
}
 */