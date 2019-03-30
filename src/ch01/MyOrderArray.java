package ch01;

import java.util.ArrayList;

public class MyOrderArray {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>(5);
//        arrayList.add(13);
//        arrayList.add(52);
//        arrayList.add(33);
//
//        System.out.println(arrayList);

        int[] arr = new int[]{1,5,36,89,98,457};
        System.out.println(binarySearch(arr,1));

    }


    private static int binarySearch(int[] arr, int value){
        int middle = 0;
        int low = 0;
        int pow = arr.length;

        while(true){
            middle = (pow + low)/2;
            if(arr[middle] == value){
                return middle;
            }else if(low > pow){
                return -1;
            }else{
                if(arr[middle] > value){
                    pow = middle -1;
                }else {
                    low = middle +1;
                }
            }

        }
    }
}
