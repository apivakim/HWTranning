package com.aug.oop;

/**
 * Created by litterTears on 16/11/2557.
 */

public class TransectionAtmImp implements  alltransection{

    public int money = 0;


    @Override
    public int depositmoney(int money) {
        this.money = this.money+money;
        return this.money;
    }

    @Override
    public int extractmoney(int money) {
        this.money = this.money-money;
        return this.money;
    }

    @Override
    public int checkcurrentmoney() {
        return this.money;
    }
}
