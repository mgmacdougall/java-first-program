package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {

    public static Map<Integer, Float> bestRates = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);

    public static float getRates(int loanTermInYears ){
        if (bestRates.containsKey(loanTermInYears)) {
            return bestRates.get(loanTermInYears);
        }
        return 0.0f;
    }
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
}
