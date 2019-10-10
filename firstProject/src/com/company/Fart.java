package com.company;

public class Fart {
    public static void main(String[] args) {
        System.out.println(stringProduce(args));
        if (args.length > 0) {
            System.out.println(multiplyByThree(Integer.valueOf(args[0])));
        }
    }

    private static String stringProduce(String[] args) {
        String hello;
        if (args.length > 0) {
            hello = "Hi, Jerry!";
        } else {
            hello = "Hi, number deficient man!";
        }
        return hello;
    }

    private static int multiplyByThree(int n) {
        return n * 3;
    }
}
