package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//        Gearbox mcLaren = new Gearbox(6);
////        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
////        System.out.println(first.driveSpeed(1000));
//        mcLaren.operateClutch(true);
//        mcLaren.switchGear(1);
//        mcLaren.operateClutch(false);
////        System.out.println(mcLaren.getCurrentGear());
////        System.out.println(mcLaren.getGears().get(mcLaren.getCurrentGear()).getRatio());
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.operateClutch(true);
//        mcLaren.switchGear(0);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.switchGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(4000));


//        class ClickListener implements Button.onClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        btnPrint.setOnClickListener(new Button.onClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }
    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
