// Reverse An Array

package Java.Arrays;

public class Program2 {

    int[] reverseAnArray(int[] array){
        for(int i=0;i<array.length/2;i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }

//    public static void main(String[] args){
//        int[] array = {1,2,3,4,5,6,7};
//        Program2 obj = new Program2();
//        for(int i: obj.reverseAnArray(array)){
//            System.out.print(i+" ");
//        }
//    }
}
