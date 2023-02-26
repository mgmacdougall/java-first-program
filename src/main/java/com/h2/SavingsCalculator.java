package com.h2;

import java.time.LocalDate;
import java.time.YearMonth;

public class SavingsCalculator {

    public static void main(String[] args){

        String[] creditsAsString= args[0].split(",");
        String[] debitsAsString = args[1].split(",");


        float[] credits = new float[creditsAsString.length];
        float[] debits = new float[creditsAsString.length];

        for(int i=0; i<creditsAsString.length; i++){
            credits[i]= Float.parseFloat(creditsAsString[i]);
        }

        for(int i=0; i<creditsAsString.length; i++){
            debits[i]= Float.parseFloat(debitsAsString[i]);
        }

        SavingsCalculator calculator = new SavingsCalculator(credits, debits);

        float netSavings = calculator.calculate();

        System.out.println("Net Savings = " + netSavings + ", remaining days in month = " + remainingDaysInMonth(LocalDate.now()));

    }

    private float[] credits;
    private float[] debits;

    public SavingsCalculator(float credits[], float debits[]){
        this.credits = credits;
        this.debits = debits;
    }

    private float sumOfCredits(){
        float sum=0.0f;
        for(int i=0; i<this.credits.length; i++){
            sum+= this.credits[i];
        }
        return sum;
    }

    private float sumOfDebits(){
        float sum=0.0f;
        for(int i=0; i<this.debits.length; i++){
            sum+= this.debits[i];
        }
        return sum;
    }

    private static int remainingDaysInMonth(LocalDate date){
        YearMonth yearMonth = YearMonth.of(date.getYear(), date.getMonth());
        int totalDaysInMonth = yearMonth.lengthOfMonth();
        int remainindays =  totalDaysInMonth- date.getDayOfMonth();

        return remainindays;
    }

    public float calculate(){
        return sumOfCredits()-sumOfDebits();
    }

}
