package ch06;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(getNumber(5));
    }

    public static int getNumber(int n){
        if(n == 1){
            return 0;
        }else if (n == 2){
            return 1;
        }else{
            return getNumber(n-1) + getNumber(n-2);
        }
    }
}
