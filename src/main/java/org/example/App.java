package org.example;

import java.math.RoundingMode;
import java.util.Scanner;

import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App
{
    static Scanner in = new Scanner(System.in);
    public static void main( String[] args )
    {
        App math= new App();
        App ask = new App();
        double c_from =ask.amount();
        double rate = ask.rate();
        double exch = math.exchanged(rate,c_from);
        double c_to = (exch);
        System.out.println( String.format("%.0f euros at an exchange rate" +
                " of %.4f is %.2f U.S. dollars.",c_from,rate,c_to) );
    }
    private double amount(){
        out.print("How many euros are you exchanging? ");
        return in.nextInt();
    }
    private double rate(){
        out.print("What is the exchange rate? ");
        return in.nextDouble();}

    private double exchanged(double rate,double c_from){
        return (rate*c_from);
    }
}

