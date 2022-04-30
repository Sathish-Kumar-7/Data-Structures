package Java.Arrays;

// Next Permutation

public class Program5 {
    public void nextPermutation(int[] array){
        if(array.length <= 1) return;
        int i = array.length - 2;
        while (i>=0 && array[i]>=array[i+1])
            i--;
        if(i>=0){
            int j = array.length - 1;
            while (array[j] <= array[i]) j--;
            System.out.println(j);
            swap(array,i,j);
        }
        reverse(array,i+1,array.length-1);
    }

    public void reverse(int[] array, int i, int j){
        while (i<j)
            swap(array,i++,j--);
    }
    public void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args){
        int[] array = {1,2,1,2,1};
        Program5 obj = new Program5();
        obj.nextPermutation(array);
        for(int i:array)
            System.out.print(i+" ");
    }
}
