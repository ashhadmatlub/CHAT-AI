package Bots;

import Interface.sports_interface;

public class tennis_bot implements sports_interface {
    String name = "Tennis";
    String type = "Indoor / Outdoor";
    int year = 1873;
    String national_Team = "England";
    String total_country = "Over 200 nations";

    public void sports_Info() {
        System.out.println("---HELLO I AM A TENNIS AI---");
        System.out.println("Name of the sports : " + name);
        System.out.println("Type of that sports ( indoor / outdoor ) : " + type);
        System.out.println("Year the sport was invented : " + year);
        System.out.println("National country of the specified sport : " + national_Team);
        System.out.println("Total number of countries which plays this sport : " + total_country + "\n");
    }
}
