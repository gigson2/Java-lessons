package org.study;

public class parsingconversion {
    public static void main(String[] args) {
        String num = "200";
        int num1 = 100;
        double con = 0.0d;

        double con1 = Double.parseDouble(num);
        int num2 = Integer.parseInt(num);
        double con2 = num1;
        System.out.println(con1);
        System.out.println(num2);
        System.out.println(con2);

    }
}
