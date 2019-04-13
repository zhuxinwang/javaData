public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        int total = 0;
//        paramCheck(total);
//        System.out.println(total);
//
//        Float totalMoney = 200000.8f;
//        Float ownMoney = 170000.5f;
//        Float leftMoney = totalMoney - ownMoney;
//        System.out.println("还剩余"+ leftMoney);

        System.out.println(findResult());
    }

    private static void paramCheck(int total){
        if(total < 1){
            total +=1;
        }
    }


    public static boolean findResult(){
        try {
            System.out.println("try");
            return true;
        }catch (Exception e){
            System.out.println("catch");
            return true;
        }finally {
            System.out.println("finally");
            return false;
        }
    }
}
