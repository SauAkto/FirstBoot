package ru.streetcover.lightVer.payment;

public class Payment {
    private String part1;
    private String part2;



    public Payment(){
    }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public double payments(String part1, String part2){
        double x = Double.valueOf(part1);
        double y = Double.valueOf(part2);
        return x+y;
    }
    public double payments2(String part1, String part2){
        double x = Double.valueOf(part1);
        double y = Double.valueOf(part2);
        return (x+y)*2;
    }
}
