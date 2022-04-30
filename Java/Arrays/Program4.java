// Contains Duplicate

package Java.Arrays;

import java.util.Arrays;

public class Program4 {
    // Time Complexity O(n*2)
    boolean containsDuplicate_BruteForce(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }
    // Time Complexity O(n*logn)
    boolean containsDuplicate_sortingApproach(int[] array){
        Arrays.sort(array);  // Time Complexity O(nlogn)
        for(int i=0;i< array.length-1;i++){
            if(array[i] == array[i+1]){
                return true;
            }
        }
        return false;
    }

//    public static void main(String[] args){
//        int[] array = {1,4,2,7,4,6,9,3,2};
//        System.out.println(new Program4().containsDuplicate_BruteForce(array));
//        System.out.println(new Program4().containsDuplicate_sortingApproach(array));
//    }
}
