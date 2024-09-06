package org.study;

public class mathformula {
    public static void main(String[] args) {
//        (a+b)^2 = a^2+2ab+b^2
        int a; float n; double c;
        a = 10; n=1.423f;
        c = (a*a)+2*(a*n)+(n*n);
        System.out.println(c); // actual results
        System.out.println((int)c); // formats to whole number
        System.out.println((float)c); // formats to Decimal points
        System.out.printf("%.2f",c); // formats to 2 D.P
    }
}
