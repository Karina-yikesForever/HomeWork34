package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>song=new ArrayList<>();
        song.add("Ветер с моря дул");
        song.add("\nНагонял беду");
        song.add("\nИ сказал ты мне");
        song.add("\nБольше не приду");
        System.out.println(song.size());
        for(int i=1;i<20;i++)
            System.out.println(song);

        }

    }
