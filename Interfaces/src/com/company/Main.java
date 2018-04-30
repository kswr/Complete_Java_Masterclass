package com.company;

public class Main {

    public static void main(String[] args) {
//        Such implementation would throw en error during creation of mobile phone instance
//        DeskPhone timsPhone;
//        Remember to put "I" before name of the interface, to make clear it's interface, not a class
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123123412);
        timsPhone.powerOn();
        timsPhone.callPhone(123123412);
        timsPhone.answer();

        timsPhone = new MobilePhone(12341234);
        timsPhone.powerOn();
        timsPhone.callPhone(12341234);
        timsPhone.answer();
    }
}
