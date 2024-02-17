package Defanging_an_IP_Address;

public class Problem1108Solution3 {
    static String address = "1.1.1.1";

    public static void main(String[] args) {
        String result = Replace(address);
        System.out.println(result);
        System.out.print(address);

/*1. yaha par note karne baali baat ye hai ki Strings are immutable(aap exsiting object mai changes nahi kar sakte hoo)
2. iski bjah se "address" mai jo String hai vo vahi rahegi
3. updated string aap return kar rahe ho method calling par
4.isliye "result" String mai updation hua hai
*/
    }

    public static String Replace(String s) {
        return (address.replace(".", "[.]"));
    }
}


/*
Leetcode Solution
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
 */