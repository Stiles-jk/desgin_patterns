package com.zstu.state;

/**
 * @auther Stiles-JKY
 * @date 2020/5/9-13:45
 */
public abstract class State {
    //扣除积分
    public abstract void deduceMoney();

    //抽奖
    public abstract boolean raffle();

    //发放奖品
    public abstract void dispensePrize();
}
