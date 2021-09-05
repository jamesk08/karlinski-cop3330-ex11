/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.print("How many euros are you exchanging? ");
        Scanner scanner = new Scanner(System.in);
        int euroAmount = scanner.nextInt();

        System.out.print("What is the exchange rate? ");
        Double exchangeRate = scanner.nextDouble();

        double usdAmount = euroAmount * exchangeRate;

        DecimalFormat usdFormat = new DecimalFormat("##.00");
        String message = MessageFormat.format(
            "{0} euros at an exchange rate of {1} is\n{2} U.S. Dollars.",
            euroAmount,
            Double.toString(exchangeRate),
            usdFormat.format(usdAmount)
        );

        System.out.printf(message);
    }
}
