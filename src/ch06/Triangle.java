package ch06;

public class Triangle {

    public static void main(String[] args) {
        System.out.println(getNumber(3));

        System.out.println(getNumberByRecursion(3));
    }


    public static int getNumber(int n){
        int total = 0;
        while (n > 0){
            total = total + n;
            n--;
        }
        return total;
    }

    public static int getNumberByRecursion(int n){
        if(n == 1){
            return 1;
        }else{
            return  n + getNumberByRecursion(n-1);
        }
    }
}
