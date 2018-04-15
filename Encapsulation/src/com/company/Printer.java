package com.company;

public class Printer {
    private Toner toner1;
    private Toner toner2;
    private Toner toner3;
    private Toner toner4;
    private boolean duplex;
    private int pagesPrinted = 0;



//    public Printer(Toner toner1, Toner toner2, Toner toner3, Toner toner4, boolean duplex) {
// TODO handle wrong color of cartridge - stop constructror; throw an error
// todo learn lambdas for such ocasions
// todo learn catching exceptions
//        if (toner1.getColor() == "red")
//            System.out.println("Red toner installed correctly");
//        else {
//            System.out.println("Incorrect toner, breaking");
//        }
//        if (toner2.getColor() == "green")
//            System.out.println("Green toner installed correctly");
//        else {
//            System.out.println("Incorrect toner, breaking");
//        }
//        if (toner3.getColor() == "blue")
//            System.out.println("Blue toner installed correctly");
//        else {
//            System.out.println("Incorrect toner, breaking");
//        }
//        if (toner4.getColor() == "black")
//            System.out.println("Black toner installed correctly");
//        else {
//            System.out.println("Incorrect toner, breaking");
//        }
//        if (duplex) {
//            System.out.println("Duplex mode available");
//            this.duplex = duplex;
//        } else {
//            System.out.println("Only single page printing available");
//        }
//    }


    public Printer(Toner toner1, Toner toner2, Toner toner3, Toner toner4, boolean duplex) {
        this.toner1 = toner1;
        this.toner2 = toner2;
        this.toner3 = toner3;
        this.toner4 = toner4;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public Toner getToner1() {
        return toner1;
    }

    public Toner getToner2() {
        return toner2;
    }

    public Toner getToner3() {
        return toner3;
    }

    public Toner getToner4() {
        return toner4;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void print(int numOfPages) {
        this.toner1.print(numOfPages);
        this.toner2.print(numOfPages);
        this.toner3.print(numOfPages);
        this.toner4.print(numOfPages);
        this.pagesPrinted += numOfPages;
        System.out.printf("Printed %d pages%n", numOfPages);
        System.out.printf("Total number of pages printed: %d%n", this.pagesPrinted);
    }

    public void getToners() {
        System.out.printf("Red toner is %d percent%nGreen toner is %d percent%nBlue toner is %d percent%nBlack toner is %d percent%n", toner1.getFill(), toner2.getFill(), toner3.getFill(), toner4.getFill());
    }
}
