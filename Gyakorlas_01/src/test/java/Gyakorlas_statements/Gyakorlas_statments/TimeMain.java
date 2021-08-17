package Gyakorlas_statements.Gyakorlas_statments;

public class TimeMain {
    public static void main(String[] args) {
        Time time = new Time(0,0,0);
        time.createTime();
        System.out.println(time.getInMinutes());
        System.out.println(time.getInSeconds());
        Time anotherTime = new Time(0,0,0);
        anotherTime.createTime();
        System.out.println(anotherTime.getInMinutes());
        System.out.println(anotherTime.getInSeconds());

        System.out.println(time.earlierThan(anotherTime));
        System.out.println("Az első időpont" + time.toString() + "=" + time.getInMinutes() + " perc");
        System.out.println("A második időpont" + anotherTime.toString() + "=" + anotherTime.getInSeconds() +" másodperc");
        System.out.println("Az első korábbi, mint a második: " + time.earlierThan(anotherTime));
    }
}
