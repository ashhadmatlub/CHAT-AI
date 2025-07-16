package Bots;

public class cricket_bot implements Interface.sports_interface {
    String name = "Cricket";
    String type = "Outdoor";
    int year = 1877;
    String national_Team = "England";
    int total_country = 104;

    public void sports_Info() {
        System.out.println("--- HELLO I AM CRICKET AI ---");
        System.out.println("Name of the sports : " + name);
        System.out.println("Type of that sports ( indoor / outdoor ) : " + type);
        System.out.println("Year the sport was invented : " + year);
        System.out.println("National country of the specified sport : " + national_Team);
        System.out.println("Total number of countries which plays this sport : " + total_country + "\n");
    }
}
