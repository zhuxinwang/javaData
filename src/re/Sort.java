package re;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] arrBinarySearch = new int[]{1,5,6,7,9,12,13};
        System.out.println(binarySearch(arrBinarySearch,9));


        int[] arrBubbleSort = new int[]{1,9,3,5,6,7,4};
        System.out.println(Arrays.toString(bubbleSort(arrBubbleSort)));

        int[] arrSelectionSort = new int[]{1,9,3,5,6,7,4};
        System.out.println(Arrays.toString(bubbleSort(arrSelectionSort)));

        int[] arrInsertSort = new int[]{1,9,3,5,6,7,4};
        System.out.println(Arrays.toString(bubbleSort(arrInsertSort)));
    }


    /**
     * 二分查找法
     * @param arr 待查找数组
     * @return 查询到返回元素位置，否则返回-1
     */
    public static int binarySearch(int[] arr,int value){
        int middle = 0;
        int low = 0;
        int pow = arr.length;
        while (true){
            middle = (low+pow)/2;
            if(arr[middle] == value){
                return middle;
            }else if (low > pow){
                return -1;
            }else{
                if(value < arr[middle]){
                    pow = middle - 1;
                }else{
                    low = middle + 1;
                }
            }
        }
    }

    /**
     * 冒泡排序法
     * @param arr 待排序数组
     * @return 有序arr
     */
    public static int[] bubbleSort(int[] arr){
        int temp = 0;
        for(int i = 0;i<arr.length-1;i++){
            for(int j = arr.length-1;j>i;j--){
                if(arr[j] > arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 选择排序
     * @param arr 待排序数组
     * @return 有序arr
     */
    public static int[] selectionSort(int[] arr){
        int i,j,k = 0;
        int temp = 0;
        for(i = 1;i<arr.length;i++){
            k = i;
            for(j = 1;j<arr.length;j++){
                if(arr[k] > arr[j]){
                    k = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    /**
     * 插入排序
     * @param arr 待排序数组
     * @return 有序arr
     */
    public static int[] insertSort(int[] arr){
        int temp = 0;
        for (int i = 1;i<arr.length;i++){
            temp = arr[i];
            for(int j=i;j>0 && arr[j-1]>temp;j--){
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        return arr;
    }


}

