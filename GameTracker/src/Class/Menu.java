package Class;
import Class.Enuns.*;
import Class.GameService;
import java.text.BreakIterator;
import java.util.Scanner;

public class Menu {
    private GameService gameService;
    private Scanner scanner;

public Menu(GameService gameservice){
    this.gameService = gameservice;
    this.scanner = new Scanner(System.in);
}

//incompleto!
public void iniciar(){
    boolean rodando = true;

    while(rodando){
        exibirPainel();
        int opcao = leropcao();
        switch (opcao) {
        case 1:
            adicionarJogo();
            break;
        case 2:
            gameService.listLibrary();
            break;
        case 3:
            atualizarStatus();
            break;
        case 4:
            mudarNotaPessoal();
            break;
        case 5:
            atualizarPrioridade();
            break;
        case 6:
            removerJogo();
            break;
        case 0:
            System.out.println("encerrando programa...");
            rodando = false;
            break;
        default:
            System.out.println("Tente novamente...");
            break;
        }
    }
}

public void exibirPainel(){
    System.out.println("\n===========================");
        System.out.println("     🎮 GAME TRACKER 🎮    ");
        System.out.println("===========================");
        System.out.println("1 - Adicionar Novo Jogo");
        System.out.println("2 - Listar Biblioteca");
        System.out.println("3 - Atualizar Status");
        System.out.println("4 - Atualizar Nota Pessoal");
        System.out.println("5 - Atualizar Prioridade");
        System.out.println("6 - Remover Jogo");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
}

private int leropcao(){
    try{
        return Integer.parseInt(scanner.nextLine().trim());
    } catch (NumberFormatException e){
        return -1;
    }
}

private void adicionarJogo(){
    System.out.println("\nNome do jogo: ");
    String nome = scanner.nextLine();
    float horas = 0;
    while(true){
    try {
        System.out.println("Horas Jogadas: ");
        String textoLimpo = scanner.nextLine().trim().replace(",",".");
        horas = Float.parseFloat(textoLimpo);
        break;
    } catch(NumberFormatException e){
        System.out.println("Formato inválido! Por favor digite novamente.");
    }
}
    Games jogoadd = new Games(nome, "tempname", null, "tempname", horas, Status.BACKLOG, 0, Prioridade.MEDIA);
    gameService.addGame(jogoadd);
}

private void atualizarStatus(){
    Status novoStatus = null;

    System.out.println("Digite o nome do jogo que deseja atualizar: ");
        String nomeJogo = scanner.nextLine();
    
    while(novoStatus == null){

        System.out.println("Digite o número do status desejado:  ");
        System.out.println("1 - JOGANDO");
        System.out.println("2 - ZERADO");
        System.out.println("3 - ABANDONADO");
        System.out.println("4 - PLATINADO"); 
        System.out.println("5 - BACKLOG");

        Integer resposta = leropcao();
        
        switch (resposta) {
            case 1:
                novoStatus = Status.JOGANDO;
                break;
            case 2: 
                novoStatus = Status.ZERADO;
                break;
            case 3: 
                novoStatus = Status.ABANDONADO;
                break;
            case 4: 
                novoStatus = Status.PLATINADO;
                break;
            case 5: 
                novoStatus = Status.BACKLOG;
                break;
            default:System.out.println("\n [ERRO] OPÇÃO INVÁLIDA, TENTE NOVAMENTE!");
                break;
        }
    }

    gameService.changeStatus(nomeJogo,novoStatus);
}

private void atualizarPrioridade(){
    Prioridade novaPrioridade = null;

    System.out.println("Digite o nome do jogo que deseja atualizar: ");
    String nomeJogo = scanner.nextLine();

    while(novaPrioridade == null){
        System.out.println("Digite o número da prioridade desejada:  ");
        System.out.println("1 - ALTA");
        System.out.println("2 - MEDIA");
        System.out.println("3 - BAIXA");

    
        Integer resposta = leropcao();
        
        switch (resposta) {

            case 1:
                novaPrioridade = Prioridade.ALTA;
                break;
            case 2: 
                novaPrioridade = Prioridade.MEDIA;
                break;
            case 3: 
                novaPrioridade = Prioridade.BAIXA;
                break;
            default:System.out.println("\n [ERRO] OPÇÃO INVÁLIDA, TENTE NOVAMENTE!");
                break;
        }
    }

    gameService.changePriority(nomeJogo,novaPrioridade);

}
private void mudarNotaPessoal(){
    int novaNota = 0;

    System.out.println("Digite o nome do jogo que deseja alterar a nota: ");
        String nomeJogo = scanner.nextLine();
    while(novaNota == 0){
        System.out.println("Digite a nova nota pessoal(1-10): ");
        Integer resposta = leropcao();
        if (resposta >= 1 && resposta <=10){
        novaNota = resposta;
        gameService.changeNota(nomeJogo, novaNota);
         break;
        }
        else{ 
        System.out.println("ERRO! POR FAVOR TENTE NOVAMENTE");
        }
    }

}

private void removerJogo(){

    System.out.println("Digite o nome do jogo que deseja remover: ");
    String resposta = scanner.nextLine();
    gameService.removeGame(resposta);
}

}


