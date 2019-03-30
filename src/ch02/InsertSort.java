package ch02;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,6,4,7};
        int[] arr1 = insetSort(arr);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
    }


    private static int[] insetSort(int[] arr){
        int temp = 0;
        for(int i = 1;i<arr.length;i++){
            temp = arr[i];
            int j = i;
            while (j>0 && arr[j-1]>=temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
            System.out.print(arr[0]+ " ");
            System.out.print(arr[1]+ " ");
            System.out.print(arr[2]+ " ");
            System.out.print(arr[3]+ " ");
            System.out.print(arr[4]+ " ");
            System.out.println();
            System.out.println("arr["+ j + "]:" + arr[j]);
            System.out.println();
        }
        return arr;
    }
}
