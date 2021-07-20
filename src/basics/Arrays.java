package basics;

public class Arrays {

    public static void main(String[] args){
        //define the size of the array
        int[] array = new int[6];
        array [0] = 155;
        array [5] = 77;
        System.out.println(array[5]);
        System.out.println(array[2]);

        //Array initializer
        String [] words = {"abc", "DEF", "ghi", "jkl"};
        words[0] = "RON"; //this will place this String into the Array
        words[1] = "RENEE";
        System.out.println(java.util.Arrays.toString(words));

    }

}
