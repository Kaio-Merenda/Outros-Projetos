package Class;
import java.time.LocalDate;
import Class.Enuns.*;

public class Games {
    private String nomeJogo;
    private String nomeDevelop;
    private LocalDate releaseDate;
    private String genero;
    private float playedHours;
    private Status status;
    private int notaPessoal;
    private Prioridade prioridade;

//CONSTRUCTOR
public Games(String nomejogo, String develop, LocalDate reledate, String gen,float playhour,Status status,int notpessoal,Prioridade priori) {
    this.nomeJogo = nomejogo;
    this.nomeDevelop = develop;
    this.releaseDate = reledate;
    this.genero = gen;
    this.playedHours = playhour;
    this.status = status;
    this.notaPessoal = notpessoal;
    this.prioridade = priori;

}

// GETERS AND SETTERS
    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public String getNomeDevelop() {
        return nomeDevelop;
    }

    public void setNomeDevelop(String nomeDevelop) {
        this.nomeDevelop = nomeDevelop;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPlayedHours() {
        return playedHours;
    }

    public void setPlayedHours(float playedHours) {
        this.playedHours = playedHours;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getNotaPessoal() {
        return notaPessoal;
    }

    public void setNotaPessoal(int notaPessoal) {
        this.notaPessoal = notaPessoal;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

}
