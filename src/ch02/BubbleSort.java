package ch02;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,6,4,7};
        int[] arr1 = bubbleSort(arr);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
    }


    public static int[] bubbleSort(int[] arr){
        int temp = 0;
        for(int i = 0;i<arr.length-1;i++){
            for(int j = arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                System.out.print(arr[0]);
                System.out.print(arr[1]);
                System.out.print(arr[2]);
                System.out.print(arr[3]);
                System.out.print(arr[4]);
                System.out.println();
            }
            System.out.println();
        }
        return arr;
    }
}
