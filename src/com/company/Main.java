package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> song = new ArrayList<>();
        ArrayList<Integer> song2 = new ArrayList<>();
        song.add("Ветер с моря дул");
        song.add("Нагонял беду");
        song.add("И сказал ты мне");
        song.add("Больше не приду");
        for(int i=0;i<20;i++){
         if(i>20){
            song2.add(i);
            song2.remove(3);
         }
        }
    System.out.println(song);
        System.out.println(song.size());
}
        }







