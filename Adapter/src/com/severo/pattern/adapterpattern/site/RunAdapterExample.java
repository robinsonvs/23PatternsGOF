package com.severo.pattern.adapterpattern.site;

import com.severo.pattern.adapterpattern.payd.PayD;
import com.severo.pattern.adapterpattern.xpay.Xpay;

public class RunAdapterExample {

    public static void main(String[] args){

        //Object for Xpay
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Wormer");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)235);
        xpay.setAmount(2565.23);

        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);
    }

    private static void testPayD(PayD payD){
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardExpMonthDate());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }

}
