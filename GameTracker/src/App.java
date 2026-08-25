import Class.*;
import java.time.LocalDate;
import Class.Enuns.*;

public class App {
    public static void main(String[] args) throws Exception {
    System.out.println("-GAME TRACKER-");

    GameService myService = new GameService();

    Games DMC = new Games("Devil may cry 5", "CAPCOM", LocalDate.of(2019,03,19), "RPG", 74.9f, Status.JOGANDO, 1, Prioridade.ALTA);
    Games LegoStarWars = new Games("Lego Star Wars", "TT Games", LocalDate.of(2002,05,15), "Aventura", 5.0f, Status.BACKLOG, 2, Prioridade.MEDIA);
    
    myService.addGame(DMC);
    myService.addGame(LegoStarWars);
    myService.listLibrary();

    myService.changeStatus("Devilmay cry 5", Status.ZERADO);
    myService.changeNota("Devil may cry 5 ", 10);
    myService.changePriority("DEVILMAYCRY 5",Prioridade.BAIXA);

    myService.changeStatus("lego starwars", Status.JOGANDO);
    myService.changeNota("lego star wars", 8);
    myService.changePriority("LEGOSTARWARS",Prioridade.ALTA);

    myService.listLibrary();

    }
}
