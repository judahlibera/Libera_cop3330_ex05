/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Judah Libera
 */
import java.util.*;
public class main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("What is the first number? ");
        String whyisthisastring = sc.nextLine();
        System.out.printf("What is the second number? ");
        String whyisthisalsoastring = sc.nextLine();
        double n1 = Double.parseDouble(whyisthisastring);
        double n2 = Double.parseDouble(whyisthisalsoastring);
        double plus = n1 + n2;
        double minus = n1 - n2;
        double times = n1 * n2;
        double divide = n1 / n2;
        System.out.printf("%f + %f = %f\n%f - %f = %f\n%f * %f = %f\n%f / %f = %f", n1, n2, plus, n1, n2, minus, n1, n2, times, n1, n2, divide);
    }
}