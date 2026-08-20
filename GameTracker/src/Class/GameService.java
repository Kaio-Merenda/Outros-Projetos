package Class;

import java.util.ArrayList;

public class GameService {
    private ArrayList <Games> biblioteca = new ArrayList<>();

//Adicionar jogo
public void addGame(Games novojogo){
    biblioteca.add(novojogo);
    System.out.println("O jogo: " + novojogo.getNomeJogo() + " foi adicionado a biblioteca.");
}
// remover jogo
public void removeGame(String nomeJogoDeletar){
    Games jogoRemover = null;
    for ( Games gameIndex : biblioteca){
        if(gameIndex.getNomeJogo().equals(nomeJogoDeletar)){
            jogoRemover = gameIndex;
            break;
        }
    }
    if(jogoRemover != null){
        biblioteca.remove(jogoRemover);
        System.out.println("O jogo: " +  jogoRemover.getNomeJogo() + " foi removido da biblioteca.");
    }
    else{System.out.println("não foi possível remover o jogo: " + nomeJogoDeletar + " não encontrado na biblioteca.");}
}
//LISTAR JOGOS
public void listLibrary() {
    if(biblioteca.isEmpty()){
        System.out.println("Biblioteca Vazia... Vá jogar alguma coisa!");
        return;
    }
    for(Games index : biblioteca){
        System.out.println("\n --- MINHA BIBLIOTECA ---");
        System.out.println("Jogo: " + index.getNomeJogo());
        System.out.println("Horas jogadas: " + index.getPlayedHours());
        System.out.println("Status: " + index.getStatus());
        System.out.println("Prioridade: " + index.getPrioridade());
        System.out.println("---------------------------------\n");
    }
}
}
