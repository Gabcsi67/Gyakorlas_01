package Gyakorlas_Literalok.localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(5.2,false);
        System.out.println(distance.getDistanceInKm() + " " + distance.isExact());
        int integerPart = (int) distance.getDistanceInKm();
        System.out.println(integerPart);
        System.out.println(5 ==6);
    }

}

