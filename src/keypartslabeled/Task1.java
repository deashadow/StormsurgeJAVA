package keypartslabeled;

import java.io.IOException;
/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59
 */
            // CLASS NAME
public class Task1
{

    private static String TEXT = "Kiss my metal rear actuator";//CLASS VARIABLE


    public static void main(String[] args) throws IOException
    {
        //SCREEN OUTPUT                    SINGLE-LINE COMMENT
        System.out.println(TEXT); //Display a single string
      //  MULTILINE COMMENT
      /*
        This is a multiline comment.
        The code below will display three identical strings.    ⎥ main() METHOD
       */
       // VARIABLE DECLARATION
        String s = "Ho-ho-ho!";
       // METHOD CALL
        printTextMoreTimes(s, 3);
    }
       // ⎦
    //METHOD PARAMETERS   ⎤
    public static void printTextMoreTimes(String s, int count)// ⎥ //METHOD SIGNATURE

    {
       // LOOP
        for (int i = 0; i < count; i++)
       // LOOP BODY                                                 ⎥ //METHOD BODY/CODE
        {
            System.out.println(s);
        }
    }

}
