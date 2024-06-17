package giulio.marra.giulio_marra.entities;

import java.util.List;

public class Menu {

    private List<Pizze> pizze;
    private List<Bevande> bevande;
    private List<Ingredienti> ingredienti;

    public Menu(List<Pizze> pizze, List<Bevande> bevande, List<Ingredienti> ingredienti) {
        this.pizze = pizze;
        this.bevande = bevande;
        this.ingredienti = ingredienti;
    }

    public List<Pizze> getPizze() {
        return pizze;
    }

    public void setPizze(List<Pizze> pizze) {
        this.pizze = pizze;
    }

    public List<Bevande> getBevande() {
        return bevande;
    }

    public void setBevande(List<Bevande> bevande) {
        this.bevande = bevande;
    }

    public List<Ingredienti> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(List<Ingredienti> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public void stampaMenu() {
        System.out.println("Pizze:");
        for (Pizze pizza : pizze) {
            System.out.println(pizza);
        }
        System.out.println("Bevande:");
        for (Bevande bevanda : bevande) {
            System.out.println(bevanda);
        }

        System.out.println("ingredienti:");
        for (Ingredienti ingrediente : ingredienti) {
            System.out.println(ingrediente);
        }
    }
}
