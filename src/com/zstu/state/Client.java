package com.zstu.state;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-13:45
 */
public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 创建活动对象，奖品有1个奖品
        RaffleActivity activity = new RaffleActivity(3);

        // 我们连续抽300次奖
        for (int i = 0; i < 50; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.deduceMoney();
            //抽奖
            activity.raffle();
        }
    }
}
