package ch07;

public class HanoiTower {

    public static void main(String[] args) {
        doTower(3,'A','B','C');
    }

    /**
     * 移动盘子
     * @param topN 移动的盘子数目
     * @param from 起始的塔
     * @param inter 中间的塔
     * @param to 目标的塔
     */
    public static void doTower(int topN,char from,char inter,char to){
        if(topN == 1){
            System.out.println("盘子" + topN + "从" + from + "塔座到" + to + "塔座");
        }else{
            doTower(topN-1, from, to, inter);
            System.out.println("**盘子" + topN + "从" + from + "塔座到" + to + "塔座");
            doTower(topN-1, inter, from, to);
        }
    }
}
