package Defanging_an_IP_Address;

public class Problem1108Solution5 {

    public static void main(String[] args) {
        String s ="1.1.1.1";
        String [] array=s.split("\\.");
        /*
         spilt method .(dot) ke hisab se split karega
         jaha par bhi . hoga uska right, left mai split kar dega
         or . inckude nahi hoga
         or String array return karega

        */

        String result= s.join("[.]",array);

        /*
        join method string type return kar dega
        join ek argument mai expected string and dusre mai array type expects karta hai
        fhir do arrays ke beech  mai expected String ko add kar deta hai (concat kar deta hai)
        (array)ye var arg type ka  hai so it can store  unlimited(as per memory) Strings


         */

        System.out.print(result);

    }
}
/*
leetcode solution:-

class Solution {
    public String defangIPaddr(String address) {
        String[] Arrays =address.split("\\.");
        /*
        for(String c: Arrays)
        {
            System.out.print(c);
        }
*/
/*
        String s =address.join("[.]",Arrays);
//System.out.print(s);

        return s;
    }

}

*/

