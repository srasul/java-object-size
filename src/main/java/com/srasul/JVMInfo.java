package com.srasul;

import org.openjdk.jol.vm.VM;

public class JVMInfo {
    public static void main(String[] args) {
        System.out.println(VM.current().details());
    }
}
