package com.zstu.state;

/**
 * 抽奖活动
 *
 * @auther Stiles-JKY
 * @date 2020/5/9-13:40
 */
public class RaffleActivity {
    State state = null;

    int count = 0;//奖品数量


    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseOutState = new DispenseOutState(this);
    State DispenseState = new DispenseState(this);

    //constructor
    public RaffleActivity(int count) {
        this.count = count;
        this.state = getNoRaffleState();
    }

    //扣除积分
    public void deduceMoney() {
        state.deduceMoney();
    }

    //抽奖
    public void raffle() {
        if (state.raffle()) {//调用了state的raffle的方法，如果中奖则会改变状态为DispenseState，并检查奖品是否发放完，发放完就结束系统
            //领取奖品
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    //用于设置状态，也是通过这个方法来改变其状态
    public void setState(State state) {
        this.state = state;
    }

    //每领取一次count--
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public State getDispenseState() {
        return DispenseState;
    }

    public void setDispenseState(State dispenseState) {
        DispenseState = dispenseState;
    }


}
