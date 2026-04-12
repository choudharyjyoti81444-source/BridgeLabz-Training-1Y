package com.gla.Generics_Collections.Generic_Problem;

import java.util.*;

class Item {
    double cost;
    Item(double cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return cost;
    }
}

class Phone extends Item {
    Phone(double cost) {
        super(cost);
    }
}

class LaptopDevice extends Item {
    LaptopDevice(double cost) {
        super(cost);
    }
}

public class PriceCheck {
    public static double totalAmount(List<? extends Item> list) {
        double ans = 0;
        for (int i = 0; i < list.size(); i++) {
            ans = ans + list.get(i).getPrice();
        }

        return ans;
    }

    public static void main(String[] args) {
        List<Phone> pList = new ArrayList<>();
        pList.add(new Phone(15000));
        pList.add(new Phone(25000));

        List<LaptopDevice> lList = new ArrayList<>();
        lList.add(new LaptopDevice(50000));
        lList.add(new LaptopDevice(80000));

        System.out.println(totalAmount(pList));
        System.out.println(totalAmount(lList));
    }
}
