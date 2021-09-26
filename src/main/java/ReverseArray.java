import org.junit.Test;

import java.util.Arrays;

public class ReverseArray {

    @Test
    public void reverseArrayTest(){
        int[] array = {1,6,9,8,2,4};
        System.out.println("Original: "+ Arrays.toString(array));
        System.out.println("Sorted and reversed: "+ Arrays.toString(sortAndReverseIt(array)));

    }

    private int[] sortAndReverseIt(int[] array) {
//        int[] array = {1,6,9,8,2,4};
        int smaller;
        for (int i=0; i< array.length; i ++){
            for(int j = i+1; j<array.length;j++){
                if(array[j] > array[i]){
                    smaller= array[i];
                    array[i]=array[j];
                    array[j]=smaller;
                }
            }
        }
        return array;
    }
}
