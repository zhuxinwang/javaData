package ch08;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,6,4,7};
        System.out.println(Arrays.toString(shellSort(arr)));
    }


    public static int[] shellSort(int[] arr){
        int temp = 0;
        //初始化一个间隔
        int h = 1;
        //计算最大间隔
        while (h < arr.length/3){
            h = h * 3 +1;
        }
        while (h>0){
            for (int i =0;i<arr.length;i++){
                temp = arr[i];
                int j = i;
                while (j>h-1 && arr[j-h]>=temp){
                    arr[j] = arr[j-h];
                    arr[j-h] = temp;
                    j-=h;
                }
                arr[j] = temp;
            }
            //减小间隔
            h = (h-1)/3;
        }
        return arr;
    }
}
