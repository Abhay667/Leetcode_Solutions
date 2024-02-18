package Fundamentals_of_programming;

public class String_replaceAll {

    public static void main(String[] args) {
        String original = "123abc456def789ghi";
        String replaced = original.replaceAll("\\d", "#");
                /*
                replaceALl regular expressions ka use karta hai
                isliye ye different hai replace se
                upar d means digits se hai, means jitne bhi digits hai "original" mai un sabhi ko Replace kar do "#" se
                yaha hum \\ ka use karnge ek \ ka use nahi kar skate hai compile time error ayega

                 */
        System.out.println(replaced); // Output: "###abc###def###ghi"

//----another program

        String ipAddress = "192.168.1.1";
        String defanged = ipAddress.replaceAll("\\.", "[.]");

                        /*
                        yaha par hum ek single character ke occurrences ko replace kar rahe hai
                         */
        System.out.println(defanged); // Output: "192[.]168[.]1[.]1"

/*
in summary replaceAll more complex replacement ke liye hai
 */


    }
}
