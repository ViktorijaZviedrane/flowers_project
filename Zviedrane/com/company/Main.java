package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Indoor f1 = new Indoor("cactus", "green", 5, 6, +20);
        Indoor f2 = new Indoor("begonia", "rose", 16, 9, +18);
        Annual f3 = new Annual("velveeta", "orange", 9, 7, 30);
        Annual f4 = new Annual("petunia", "violet", 24, 8, 28 );
        Perennials f5 = new Perennials("bellflower", "blue", 30, 3, 4);
        Perennials f6 = new Perennials("lupine", "purple", 12, 2, 1);

        ArrayList<Flowers> flowers = new ArrayList<>();
        flowers.add(f1);
        flowers.add(f2);
        flowers.add(f3);
        flowers.add(f4);
        flowers.add(f5);
        flowers.add(f6);

        for(Flowers i: flowers){
            System.out.println(i.printInfo());
        }

//        try {
//            FileWriter myWriter = new FileWriter("output.txt");
//
//            for(Flowers m: flowers){
//                myWriter.write(m.printInfo() + "\n");
//            }
//            System.out.println("Successfully written to the file");
//            myWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("Error!");
//        }

    }
}
