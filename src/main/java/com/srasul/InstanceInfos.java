package com.srasul;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;

public class InstanceInfos {
    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer("srasul", true, 100, 1, 100.0f);

        System.out.println(ClassLayout.parseInstance(gamePlayer).toPrintable());

        System.out.println(GraphLayout.parseInstance(gamePlayer).toPrintable());
        System.out.println(GraphLayout.parseInstance(gamePlayer).toFootprint());

    }
}
