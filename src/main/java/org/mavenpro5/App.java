package org.mavenpro5;

import java.util.Scanner;
import org.mavenpro5.Calci;


public class App 
{
    public static void main( String[] args )
    {
        Calci c = new Calci();
        int a=2;
        int b=4;
        System.out.println(a + " + " + b + " = " +c.addition(a, b));
        System.out.println(a + " - " + b + " = " +c.subtraction(a, b));
        System.out.println(a + " * " + b + " = " +c.multiplication(a, b));
        System.out.println(a + " / " + b + " = " +c.division(a, b));
        System.out.println(a + " % " + b + " = " +c.remainder(a, b));
        
    }
}
