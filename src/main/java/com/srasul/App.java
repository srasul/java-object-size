package com.srasul;

import org.openjdk.jol.info.ClassLayout;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println(ClassLayout.parseClass(GamePlayer.class).toPrintable());

//        System.out.println(ClassLayout.parseInstance("srasul").toPrintable());
//        System.out.println(ClassLayout.parseInstance("srasul".getBytes()).toPrintable());
//        System.out.println(ClassLayout.parseInstance("srasul1".getBytes()).toPrintable());
//        System.out.println(ClassLayout.parseInstance("srasul12".getBytes()).toPrintable());


//        System.out.println(ClassLayout.parseClass(String.class).toPrintable());
//        System.out.println(ClassLayout.parseClass(byte[].class).toPrintable());
    }
}
