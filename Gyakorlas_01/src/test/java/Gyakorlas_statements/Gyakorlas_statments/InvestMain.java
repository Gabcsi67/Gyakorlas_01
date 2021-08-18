package Gyakorlas_statements.Gyakorlas_statments;

public class InvestMain {
    public static void main(String[] args) {
        Investment investment = new Investment(8,105);
        System.out.println(investment.getYield(4));
        System.out.println(105*(Math.pow(1.08,4)));
    }
}
