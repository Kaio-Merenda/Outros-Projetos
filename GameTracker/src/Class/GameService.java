package Class;
import Class.Enuns.*;
import java.util.ArrayList;

public class GameService {
    private ArrayList <Games> biblioteca = new ArrayList<>();

//Adicionar jogo
public void addGame(Games newGame){
    biblioteca.add(newGame);
    System.out.println("O jogo: " + newGame.getNomeJogo() + " foi adicionado a biblioteca.");
}
// remover jogo
public void removeGame(String deleteGameName){
    Games jogoRemover = null;
    for ( Games gameIndex : biblioteca){
        if(gameIndex.getNomeJogo().replace(" ","").equalsIgnoreCase(deleteGameName.replace(" ",""))){
            jogoRemover = gameIndex;
            break;
        }
    }
    if(jogoRemover != null){
        biblioteca.remove(jogoRemover);
        System.out.println("O jogo: " +  jogoRemover.getNomeJogo() + " foi removido da biblioteca.");
    }
    else{System.out.println("não foi possível remover o jogo: " + deleteGameName + " não encontrado na biblioteca.");}
}
//LISTAR JOGOS
public void listLibrary() {
    if(biblioteca.isEmpty()){
        System.out.println("Biblioteca Vazia... Vá jogar alguma coisa!");
        return;
    }

    System.out.println("\n --- MINHA BIBLIOTECA ---");
    for(Games index : biblioteca){
        System.out.println("Jogo: " + index.getNomeJogo());
        System.out.println("Horas jogadas: " + index.getPlayedHours());
        System.out.println("Status: " + index.getStatus());
        System.out.println("Prioridade: " + index.getPrioridade());
        System.out.println("---------------------------------\n");
    }
}
//ATUALIZAR STATUS, NOTA E PRIORIDADE
public void changeStatus(String nameGame, Status newStat){
    for(Games index : biblioteca){
        if(index.getNomeJogo().replace(" ","").equalsIgnoreCase(nameGame.replace(" ",""))){
            index.setStatus(newStat);
            System.out.println("STATUS ALTERADO COM SUCESSO PARA: " + index.getStatus() + "!");
            return;
        }
    }
    System.out.println("ERRO! JOGO NÃO ENCONTRADO...");
}

public void changeNota(String nameGame, int notaPessoal){
    for(Games index : biblioteca){
        if(index.getNomeJogo().replace(" ","").equalsIgnoreCase(nameGame.replace(" ",""))){
            index.setNotaPessoal(notaPessoal);
            System.out.println("NOTA ALTERADA COM SUCESSO PARA: " + index.getNotaPessoal() + "!");
            return;
        }
    }
    System.out.println("ERRO! JOGO NÃO ENCONTRADO...");
}

public void changePriority(String nameGame, Prioridade newPriority){
    for(Games index : biblioteca){
        if(index.getNomeJogo().replace(" ","").equalsIgnoreCase(nameGame.replace(" ",""))){
            index.setPrioridade(newPriority);
             System.out.println("PRIORIDADE ALTERADA COM SUCESSO PARA: " + index.getPrioridade() + "!");
            return;
        }
    }
    System.out.println("ERRO! JOGO NÃO ENCONTRADO...");
}

}
