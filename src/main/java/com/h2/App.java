package com.h2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello" );
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the loan term (in years)");
        int loanTermInYears = scanner.nextInt();
        float bestRate = BestLoanRates.getRates(loanTermInYears);

        if(bestRate==0.0f){
            System.out.println("No available rates for term: " + loanTermInYears + " years");
        }else{
            System.out.println("Best Available Rate: " + BestLoanRates.getRates(loanTermInYears) + "%");
        }
        scanner.close();

    }

    public static int doubleTheNumber(int number) {
        return number*2;
    }


    private static int add(int[] numbers){
        int sum = 0;
        for (int i=0; i< numbers.length; i++){
            sum+= numbers[i];
        }
        return sum;
    }
}
