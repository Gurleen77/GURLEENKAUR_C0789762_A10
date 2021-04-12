package com.GURLEENKAUR_C0789762_A10;

import java.util.ArrayList;
import java.util.Scanner;

public class Sales extends SalesPerson{

    public Sales(double sales, double advance) {
        super(sales, advance);
    }

    public static void main(String[] args) {
        ArrayList<Sales> sales = new ArrayList();
        Scanner scan = new Scanner (System.in);
        System.out.println("Kindly enter the total number of Salespersons:");
        double sale = 0.00;
        double advance;
        int num = scan.nextInt();
        for(int i = 0; i<num; i++){
            System.out.println("Kindly enter the monthly pay of "+(i+1)+ " salesperson:");
            sale = scan.nextDouble();
            System.out.println("Enter the amount of advanced took by "+(i+1)+ " salesperson:");
            advance = scan.nextDouble();
            sales.add(new Sales(sale,advance));
        }
        for (Sales Sale : sales){
            Sale.display();
        }
    }

    @Override
    void display() {
        System.out.println("The total sales of the salesperson " + this.sales);
        System.out.println("The total advance of the salesperson " + this.advance);
        double payment=0.00;
        double totalPayment = 0.00;
        if(this.sales < 10000)
            payment = this.sales*0.5;
        else if(this.sales>=10000 && this.sales<15000)
            payment=this.sales*0.10;
        else if(this.sales>=15000 && this.sales<18000)
            payment=this.sales*0.12;
        else if(this.sales>=18000 && this.sales<22000)
            payment=this.sales*0.15;
        else if(this.sales >=22000)
            payment = this.sales*0.16;
        totalPayment =payment-this.advance;
        System.out.println("The total commission of the salesperson is " + totalPayment);
    }
}