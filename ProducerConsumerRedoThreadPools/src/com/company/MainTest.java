package com.company;

public class MainTest {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            i++;
            if (i < 5) {
                continue;
            }
            System.out.println("Integer i is: " + i);
            if (i > 10) {
                break;
            }
        }
    }
}
