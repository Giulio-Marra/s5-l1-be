package giulio.marra.giulio_marra;


import giulio.marra.giulio_marra.entities.Bevande;
import giulio.marra.giulio_marra.entities.Ingredienti;
import giulio.marra.giulio_marra.entities.Menu;
import giulio.marra.giulio_marra.entities.Pizze;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class Beansconfig {

    @Bean
    public Ingredienti mozzarella() {
        return new Ingredienti("Mozzarella");
    }

    @Bean
    public Ingredienti pomodoro() {
        return new Ingredienti("Pomodoro");
    }

    @Bean
    public Ingredienti funghi() {
        return new Ingredienti("Funghi");
    }

    @Bean
    public Ingredienti prosciutto() {
        return new Ingredienti("Prosciutto");
    }

    @Bean
    public Ingredienti ananas() {
        return new Ingredienti("ananas");
    }

    @Bean
    public List<Ingredienti> ingredientiBase() {
        return Arrays.asList(mozzarella(), pomodoro());
    }

    @Bean
    public Pizze margherita() {
        return new Pizze("Margherita", 5.00, new ArrayList<>(ingredientiBase()));
    }

    @Bean
    public Pizze funghiPizza() {
        List<Ingredienti> ingredienti = new ArrayList<>(ingredientiBase());
        ingredienti.add(funghi());
        return new Pizze("Funghi", 6.50, ingredienti);
    }

    @Bean
    public Pizze prosciuttoPizza() {
        List<Ingredienti> ingredienti = new ArrayList<>(ingredientiBase());
        ingredienti.add(prosciutto());
        ingredienti.add(ananas());
        return new Pizze("Hawaiian Pizza", 7.00, ingredienti);
    }

    @Bean
    public Bevande coca() {
        return new Bevande(2.50, "coca-cola");
    }

    @Bean
    public Bevande acqua() {
        return new Bevande(1.50, "acqua");
    }

    @Bean
    public Bevande sprite() {
        return new Bevande(2.00, "sprite");
    }

    @Bean
    public Menu menu(List<Pizze> pizze, List<Bevande> bevande, List<Ingredienti> ingredienti) {
        return new Menu(pizze, bevande, ingredienti);
    }


}
