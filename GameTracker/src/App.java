import Class.*;

public class App {
    public static void main(String[] args) throws Exception {

    GameService myService = new GameService();
    Menu menu = new Menu(myService);

    menu.iniciar();

    }
}
