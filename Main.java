package com.sistema.estudiante;

import model.A;
import model.W;
import model.X;
import model.Z;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        A a = new A(10);
        X x = new X(a);

        System.out.println(x);
        System.out.println(x.w1());
        System.out.println(x.z2(true));

        Z z = x;
        W w = x;
    }
}
