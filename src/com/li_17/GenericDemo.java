package com.li_17;

public class GenericDemo {
    public static void main(String[] args) {
        Genericmpl<String> g1 = new Genericmpl<>();
        g1.show("林青霞");

        Genericmpl<Integer> g2 = new Genericmpl<>();
        g2.show(12);

    }
}
