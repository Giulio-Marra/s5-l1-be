package giulio.marra.giulio_marra.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizze {
    private String nome;
    private double prezzoBase;
    private List<Ingredienti> ingredientiAggiuntivi = new ArrayList<>();

    public Pizze(String nome, double prezzoBase, List<Ingredienti> ingredientiAggiuntivi) {
        this.nome = nome;
        this.prezzoBase = prezzoBase;
        this.ingredientiAggiuntivi = ingredientiAggiuntivi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzoBase() {
        return prezzoBase;
    }

    public void setPrezzoBase(double prezzoBase) {
        this.prezzoBase = prezzoBase;
    }

    public List<Ingredienti> getIngredientiAggiuntivi() {
        return ingredientiAggiuntivi;
    }

    public void setIngredientiAggiuntivi(List<Ingredienti> ingredientiAggiuntivi) {
        this.ingredientiAggiuntivi = ingredientiAggiuntivi;
    }

    @Override
    public String toString() {
        return "Pizze{" +
                "nome='" + nome + '\'' +
                ", prezzoBase=" + prezzoBase +
                ", ingredientiAggiuntivi=" + ingredientiAggiuntivi +
                '}';
    }
}
