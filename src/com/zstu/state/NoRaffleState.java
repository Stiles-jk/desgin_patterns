package com.zstu.state;

/**
 * 不能抽奖状态
 *
 * @auther Stiles-JKY
 * @date 2020/5/9-13:47
 */
public class NoRaffleState extends State {
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("扣除50积分成功，您可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("当前状态无法抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("当前状态无法发放奖品");
    }
}
