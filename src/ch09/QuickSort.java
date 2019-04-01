package ch09;

/**
 * 快速排序
 */
public class QuickSort {


    public static void partition(int arr[],int left,int right,int point){
        int leftPtr = left -1;
        int rightPtr = right;
        while (true){
            //循环，将比关键字小的留在左端
            while(leftPtr < rightPtr && arr[++leftPtr] < point);
            //循环，将比关键字大的留在右端
            while(rightPtr > leftPtr && arr[--rightPtr] > point);
            if(leftPtr >= rightPtr){
                break;
            }
            else{
                int temp = arr[leftPtr];
                arr[rightPtr] = arr[rightPtr];
                arr[right] = temp;
            }
        }
        int temp = arr[leftPtr];
        arr[leftPtr] = arr[right];
    }
}
