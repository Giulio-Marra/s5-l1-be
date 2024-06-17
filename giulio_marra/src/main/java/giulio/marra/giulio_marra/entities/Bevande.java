package giulio.marra.giulio_marra.entities;

public class Bevande {

    private String name;
    private double prezzo;

    public Bevande(double prezzo, String name) {
        this.prezzo = prezzo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Bevande{" +
                "name='" + name + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
