package RemovingAnElementFromArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int removeIndex = 1;
        int j=0;
        for(int i = 0; i < my_array.length -1; i++)
        {

            if(i==1)
            {

            }
            else
            {
                my_array[j] = my_array[i];
                j++;
            }

        }
        System.out.println("Original Array : "+ Arrays.toString(my_array));
    }
}
