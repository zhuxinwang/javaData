package ch02;

/**
 * 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,6,4,7};
        int[] arr1 = selectionSort(arr);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
    }


    private static int[] selectionSort(int[] arr){
        int k = 0;
        int temp = 0;
        for(int i = 0;i<arr.length-1;i++){
            k = i;
            for(int j = i;j<arr.length-1;j++){
                if(arr[j] < arr[k]){
                    k = j;
                    System.out.print(arr[0]);
                    System.out.print(arr[1]);
                    System.out.print(arr[2]);
                    System.out.print(arr[3]);
                    System.out.print(arr[4]);
                    System.out.println();
                }
                System.out.println();
            }
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;

        }
        return arr;
    }
}
