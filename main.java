import Bots.cricket_bot;
import Bots.football_bot;
import Bots.tennis_bot;
import Interface.sports_interface;

public class main {
    public static void main(String[] args) {
        // For cricket
        sports_interface Cricket = new cricket_bot();
        Cricket.sports_Info();
        sports_interface Football = new football_bot();
        Football.sports_Info();
        sports_interface Tennis = new tennis_bot();
        Tennis.sports_Info();
    }
}
