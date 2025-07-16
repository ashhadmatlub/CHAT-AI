package Bots;

import Interface.sports_interface;

public class football_bot implements sports_interface {
    String name = "Football";
    String type = "Outdoor";
    int year = 1863;
    String national_Team = "England";
    String total_country = "over 250 nations";

    public void sports_Info() {
        System.out.println("---HELLO I AM FOOTBALL AI---");
        System.out.println("Name of the sports : " + name);
        System.out.println("Type of that sports ( indoor / outdoor ) : " + type);
        System.out.println("Year the sport was invented : " + year);
        System.out.println("National country of the specified sport : " + national_Team);
        System.out.println("Total number of countries which plays this sport : " + total_country + "\n");
    }
}
