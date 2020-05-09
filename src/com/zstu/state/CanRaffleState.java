package com.zstu.state;

import java.util.Random;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-13:52
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣取过了积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("开始抽奖");
        Random random = new Random();
        int num = random.nextInt(10);
        if (num == 0) {
            //中奖
            System.out.println("抽中奖品！");
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有抽中奖品！");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
