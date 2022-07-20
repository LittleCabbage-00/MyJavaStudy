package Generics.LimitGenerics;

import Generics.Basical.Info;

public class upLimit {
    public static void main(String[] args) {
        Info<Integer> i1 = new Info<Integer>();
        Info<Float> i2 = new Info<Float>();
        i1.setVar(30);
        i2.setVar(30.1f);
        fun(i1);
        fun(i2);
    }
    public static void fun(Info<? extends Number> temp){
        System.out.print(temp +"、");
    }
}
