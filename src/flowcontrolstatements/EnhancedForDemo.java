package flowcontrolstatements;

class EnhancedForDemo {
    public static void main(String[] args){
        int[] numbers =
                {0, 5, 8, 2, 6, 21, 12, 45, 3, 7};
        for (int item : numbers) {//'item' is the variable holding
            // the current value of the array
            System.out.println("Count is: " + item);
        }
    }
}
