public class Problem1119Solution4 {
    StringBuffer result = new StringBuffer();

    public  static void remove(String s)
    {
        int length= s.length();
        for(int i =0;i<length;i++)
        {
            if(s.charAt(i)!='a'&& s.charAt(i)!='e')
            {
                System.out.print(s.charAt(i));
            }
            else {
                //System.out.println("HI");
            }

        }
    }


    public static void main(String[] args) {
    String s;
    s= "abcdefaaag";
    remove(s);

    }
}
