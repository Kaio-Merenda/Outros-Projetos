import java.util.ArrayList;
import Class.*;
import java.time.LocalDate;
import Class.Enuns.*;

public class App {
    public static void main(String[] args) throws Exception {
    System.out.println("-GAME TRACKER-");

    GameService myService = new GameService();

    Games DMC = new Games("Devil may cry 5", "CAPCOM", LocalDate.of(2019,03,19), "RPG", 74.9f, Status.ZERADO, 10, Prioridade.ALTA);
    Games LegoStarWars = new Games("Lego Star Wars", "TT Games", LocalDate.of(2002,05,15), "Aventura", 5.0f, Status.JOGANDO, 10, Prioridade.MEDIA);
    
    myService.addGame(DMC);
    myService.addGame(LegoStarWars);

    myService.listLibrary();
    myService.removeGame("Devil may cry 5");

    myService.listLibrary();
    
    }
}
