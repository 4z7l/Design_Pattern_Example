package main;

import fan.HandHeldFan;

public class Main {
    public static void main(String[] args) {
        HandHeldFan handHeldFan = new HandHeldFan();
        System.out.println("손풍기 샀다!! 작동 시켜볼까?\n");
        for(int i=0;i<6;i++){
            System.out.print("딸깍 -> ");
            handHeldFan.clickButton();
        }
    }
}
