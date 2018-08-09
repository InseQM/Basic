package com.codes.java_collections.collections;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ShowHand {
    //定义游戏最多的玩家
    private final int PLAY_NUM = 5;
    //定义扑克的花色与数值
    private String[] types = {"方块", "草花", "红心", "黑桃"};
    private String[] value = "2 3 4 5 6 7 8 9 10 J Q K A".split(" ");
    private List<String> cards  =new LinkedList<>();
    private String[] players = new String[PLAY_NUM];
    private List<String>[] playerCards = new List[PLAY_NUM];
    /**
     * 初始化扑克牌，放入52张
     * 并且使用shuffle方法使他们随机顺序排列
     */
    public void initCard(){
        for (int i = 0; i < types.length; i++){
            for (int j = 0; j < value.length; j++){
                cards.add(types[i] + value[j]);
            }
        }
        Collections.shuffle(cards);
    }
    /**
     * 初始化玩家，为每个玩家分配用户名
     */
    public void initPlayers(String... names){
        if (names.length > PLAY_NUM || names.length < 2){
            System.out.println("玩家数量不对");
            return;
        }
        for (int i = 0; i < names.length; i++) {
            //初始化玩家用户名
            players[i] = names[i];
        }
    }
    /**
     * 初始化玩家手上的扑克牌，开始游戏时每个玩家手上的扑克牌为空
     * 程序使用一个长度为0的LinkedList来表示
     */
    public void initPlayerCards(){
        for (int i = 0; i < playerCards.length; i++) {
            if (players[i] != null && !players[i].equals("")){
                playerCards[i] = new LinkedList<String>();
            }
        }
    }
    /**
     * 输出全部扑克牌，该方法没有实际作用，仅做测试
     */
    public void showAllCards(){
        for (String card : cards){
            System.out.print(card + " ");
        }
        System.out.println();
    }
    /**
     * 派发扑克牌
     * @param first 最先派发给谁
     */
    public void deliverCard(String first){
        int firstIndex = ArrayUtils.indexOf(players, first);
        for (int i = firstIndex; i < PLAY_NUM; i++){
            if (players[i] != null){
                playerCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
        for (int i = 0; i < firstIndex; i++){
            if (players[i] != null){
                playerCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }

    }
    /**
     * 输出玩家手上的扑克牌
     */
    public void showPlayerCards(){
        for (int i = 0; i < PLAY_NUM; i++){
            if (players[i] != null){
                System.out.println(players[i] + ":\t");
                for (String card : playerCards[i]){
                    System.out.println(card + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ShowHand sh = new ShowHand();
        sh.initPlayers("樱", "雪");
        sh.initCard();
        sh.initPlayerCards();
        sh.showAllCards();
        System.out.println("--------------------------------");
        sh.deliverCard("樱");
        sh.showPlayerCards();
    }
}
