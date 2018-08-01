package com.kswr;

import java.util.Map;

public class MainChallenge {

    private static StockList stockList = new StockList();
    private static StockItem temp;

    public static void main(String[] args) {
        temp = new StockItem("cake", 1.10, 7);
        temp.reserve(3);
        stockList.addStock(temp);
        temp = new StockItem("car", 12.10, 2);
        stockList.addStock(temp);
        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.5, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);
        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);
        temp = new StockItem("juice", 2.5, 36);
        stockList.addStock(temp);
        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);
        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);
        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        Basket kswr = new Basket("Ksawery");
        Basket tim = new Basket("Tim");
        System.out.println(stockList);

//        temp = stockList.get("towel");
//        System.out.println(temp);


//        stockList.reserveStock("vase", 20);
//        System.out.println(stockList);

//        System.out.println("==================");

//        kswr.addToBasket(stockList.get("vase"),20);
//        System.out.println(kswr.toString());


        System.out.println("==================");
        reserveItem(kswr, "vase", 20);
        reserveItem(tim, "car", 1);
        System.out.println(stockList);
        System.out.println(kswr);
        System.out.println(tim);
        System.out.println("==================");
        sellItems(kswr);
        System.out.println(stockList);
        System.out.println(kswr);
        System.out.println("==================");
        sellItems(tim);
        System.out.println(stockList);
        System.out.println(tim);

    }

    public static int reserveItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }

    public static int sellItems(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.sellItems();
        return 0;
    }
}
