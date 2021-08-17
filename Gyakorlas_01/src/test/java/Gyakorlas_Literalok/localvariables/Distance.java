package Gyakorlas_Literalok.localvariables;

public class Distance {

    private double distanceInKm;
    private boolean exact;
    public int dist;
    public double getDistanceInKm() {
        return distanceInKm;
    }

    public Distance(double distanceInKm, boolean exact){
        this.distanceInKm = distanceInKm;
        this.exact = exact;
    }

    public boolean isExact() {
        return exact;
    }
}
