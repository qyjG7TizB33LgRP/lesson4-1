package com.company;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("green");
        color.add("black");
        color.add("white");
        color.add("pink");
        color.add("yellow");
        System.out.println(color);

        Collections.sort(color);
        System.out.println(color);

        Collections.shuffle(color);
        System.out.println(color);

        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));

        }
        System.out.println("________________________________");


    }
}
