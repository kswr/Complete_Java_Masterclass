package com.company;

public class Main {

    public static void main(String[] args) {
        Toner toner1 = new Toner("red",100);
        Toner toner2 = new Toner("green",100);
        Toner toner3 = new Toner("blue",100);
        Toner toner4 = new Toner();

        Printer printer1 = new Printer(toner1, toner2, toner3, toner4, true);
        System.out.println(printer1.getPagesPrinted());
        printer1.print(4);
        printer1.getToners();
        printer1.print(104);
        System.out.println(printer1.getPagesPrinted());
    }
}
