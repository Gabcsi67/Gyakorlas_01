package Gyakorlas_statements.Gyakorlas_statments;

import java.util.Scanner;

public class Time {

    private int hour;
    private int minute;
    private int second;

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void createTime(){
        System.out.println("Óra?");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();

        System.out.println("Perc?");
        int minute = scanner.nextInt();

        System.out.println("Másodperc?");
        int second = scanner.nextInt();

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getInMinutes(){
        return hour * 60 + minute;
    }
    public int getInSeconds(){
        return hour * 60 *60 + minute * 60 + second;
    }
    public boolean earlierThan(Time time){
        int egy = this.getInSeconds();
        int ketto = time.getInSeconds();
        if (egy < ketto){
            return true;
        } else {
        return false;}
    }

    @Override
    public String toString() {
        return hour+":"+minute+":"+second;
    }
}
