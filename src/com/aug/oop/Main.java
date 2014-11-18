package com.aug.oop;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // write your code here


        TransectionAtmImp atmdeposi = new TransectionAtmImp();

        System.out.println("deposit: "+atmdeposi.depositmoney(1000));
        System.out.println("deposit: "+atmdeposi.depositmoney(1000));
        System.out.println("deposit: "+atmdeposi.depositmoney(500));
        atmdeposi.extractmoney(2500);
        //atmdeposi.extractmoney(2500);
        if(atmdeposi.checkcurrentmoney()>=0) {
            System.out.println("check: " + atmdeposi.checkcurrentmoney());
        }else if(atmdeposi.checkcurrentmoney()<0){
            System.out.println("can not extractmoney...");
        }atmdeposi.extractmoney(2500);
        //atmdeposi.extractmoney(2500);
        if(atmdeposi.checkcurrentmoney()>=0) {
            System.out.println("check: " + atmdeposi.checkcurrentmoney());
        }else if(atmdeposi.checkcurrentmoney()<0){
            System.out.println("can not extractmoney...");
        }

    }
}
