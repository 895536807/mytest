package cn.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        // 存放整副牌
        ArrayList<String> box = new ArrayList<String>();
        // 存花色
        ArrayList<String> colors = new ArrayList<String>();
        // 存数字
        ArrayList<String> numbers = new ArrayList<String>();
        colors.add("黑桃");
        colors.add("红心");
        colors.add("方块");
        colors.add("黑梅");
        for (int i = 2;i<=10;i++){
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        for (String s :
                colors) {
            for (String number:
                 numbers) {
                number = s + number;
                box.add(number);
            }
        }
        box.add("大王");
        box.add("小王");
        Collections.shuffle(box);
    
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        for (int i = 0;i<box.size();i++){
            String pai = box.get(i);
            if (i >=51){
                dipai.add(pai);
            }else {
                if (i%3 == 0){
                    player1.add(pai);
                }
                if (i%3 == 1){
                    player2.add(pai);
                }
                if (i%3 == 2){
                    player3.add(pai);
                }
            }

        }
        System.out.println("玩家一:"+player1);
        System.out.println("玩家二:"+player2);
        System.out.println("玩家三:"+player3);
        System.out.println("底牌:"+dipai);




    }
}
