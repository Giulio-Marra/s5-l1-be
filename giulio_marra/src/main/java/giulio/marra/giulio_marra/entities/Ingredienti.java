package giulio.marra.giulio_marra.entities;

public class Ingredienti {

    private String ingrediente;

    public Ingredienti(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "Ingredienti{" +
                "ingrediente='" + ingrediente + '\'' +
                '}';
    }
}
