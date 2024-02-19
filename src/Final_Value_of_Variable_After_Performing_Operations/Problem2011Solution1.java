package Final_Value_of_Variable_After_Performing_Operations;

public class Problem2011Solution1 {
    public static void main(String[] args) {
        //String operations[]={"X++","++X","--X","X--"};
        String operations[]={"++X","++X","X++"};
                int x=0;
                // for(String c: operations)
                // {
                //     System.out.println(c);
                // }

                for(String c: operations)
                {
                    if(c.equals("--X")||c.equals("X--"))
                    {
                        x =x-1;
                        //System.out.println("hi");
//System.out.println(x);
                    }
                    if(c.equals("X++")||c.equals("++X"))
                    {
                        x =x+1;
                        //System.out.println("hi ++");
                    }


                }
                System.out.print(x);

            }
        }
//if-if
//if||
//if else if
//if!||

