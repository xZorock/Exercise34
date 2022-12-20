package it.develhope.exercise34;

public class Start {
    public static void main(String[] args) {

        String s1 = "tup tuup tuuup tuuuup";
        String s2 = s1.replaceAll("[u]{2,3}","X");

        System.out.println(s2);

    }
}
