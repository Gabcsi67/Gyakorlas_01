package Gyakorlas_statements.Gyakorlas_statments;

public class Investment {
            private double cost;
            private int fund;
            private int interestRate;
            private boolean active;

            public int getFund() {
                return fund;
            }

            public Investment(int fund, int interestRate){
                this.interestRate = interestRate;
                this.fund = fund;
            }

            public double getYield(int days){
                double a= 1+(fund/100);
                double b= days;
                double f = interestRate*Math.pow(a,b);
                return f;
            }
}
