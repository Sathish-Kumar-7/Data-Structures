// Min And Max Of An Array

package Java.Arrays;

public class Program1 {
    static class MinMaxValue {
        int min;
        int max;
    }

    MinMaxValue minMax_SimpleApproach(int[] array){
        MinMaxValue obj = new MinMaxValue();
        if(array.length == 0){
            return null;
        }
        else if(array.length == 1){
            obj.max = array[0];
            obj.min = array[0];
            return obj;
        }else{
            obj.max = array[0];
            obj.min = array[0];
            for(int i=1;i<array.length;i++){
                if(obj.min>array[i])
                    obj.min = array[i];
                if(obj.max<array[i])
                    obj.max = array[i];
            }
            return obj;
        }
    }

    MinMaxValue minMax_TournamentMethod(int[] array, int low, int high){
        MinMaxValue minMaxValue = new MinMaxValue();
        MinMaxValue leftMinMaxValue = new MinMaxValue();
        MinMaxValue rightMinMaxValue = new MinMaxValue();
        if(array.length == 0){
            return null;
        } else if (low==high) {
            minMaxValue.max = array[low];
            minMaxValue.min = array[low];
            return minMaxValue;
        } else if (low+1 == high) {
            if(array[low]>array[high]){
                minMaxValue.min = array[high];
                minMaxValue.max = array[low];
            }else{
                minMaxValue.max = array[high];
                minMaxValue.min = array[low];
            }
        }
        int mid = (low+high)/2;
        leftMinMaxValue = minMax_TournamentMethod(array,low,mid);
        rightMinMaxValue = minMax_TournamentMethod(array,mid+1,high);
        if(leftMinMaxValue.min < rightMinMaxValue.min){
            minMaxValue.min = leftMinMaxValue.min;
        }else {
            minMaxValue.min = rightMinMaxValue.min;
        }
        if (leftMinMaxValue.max > rightMinMaxValue.max){
            minMaxValue.max = leftMinMaxValue.max;
        }else{
            minMaxValue.max = rightMinMaxValue.max;
        }
        return minMaxValue;
    }

    MinMaxValue minMax_ComparingPairs(int[] array){
        MinMaxValue minMaxValue = new MinMaxValue();
        int i = 0;
        if (array.length == 0)
            return null;
        else if (array.length == 1){
            minMaxValue.max = array[0];
            minMaxValue.min = array[0];
            return minMaxValue;
        }
        if(array.length%2==0){
            if(array[0]>array[1]){
                minMaxValue.min = array[1];
                minMaxValue.max = array[0];
            }else{
                minMaxValue.max = array[1];
                minMaxValue.min = array[0];
            }
            i+=2;
        }else{
            minMaxValue.min = array[0];
            minMaxValue.max = array[0];
            i+=1;
        }
        while (array.length -1 >i){
            if(array[i]>array[i+1]){
                if (array[i] > minMaxValue.max)
                    minMaxValue.max = array[i];
                if (array[i+1] < minMaxValue.min)
                    minMaxValue.min = array[i+1];
            }else{
                if (array[i+1] > minMaxValue.max)
                    minMaxValue.max = array[i+1];
                if (array[i] < minMaxValue.min)
                    minMaxValue.min = array[i];
            }
            i+=2;
        }
        return minMaxValue;
    }
//    public static void main(String[] args){
//        int[] array = {5753,26587,8,-23,-1000,-7,70};
//        Program1 obj = new Program1();
//        System.out.println(obj.minMax_SimpleApproach(array).max);
//        System.out.println(obj.minMax_SimpleApproach(array).min);
//        System.out.println(obj.minMax_TournamentMethod(array,0, array.length-1).max);
//        System.out.println(obj.minMax_TournamentMethod(array,0,array.length-1).min);
//        System.out.println(obj.minMax_ComparingPairs(array).max);
//        System.out.println(obj.minMax_ComparingPairs(array).min);
//    }
}
