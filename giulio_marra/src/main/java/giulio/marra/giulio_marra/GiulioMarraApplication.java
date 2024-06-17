package giulio.marra.giulio_marra;

import giulio.marra.giulio_marra.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class GiulioMarraApplication {

    public static void main(String[] args) {
        SpringApplication.run(GiulioMarraApplication.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(GiulioMarraApplication.class);

        Menu f1 = ctx.getBean(Menu.class);
        f1.stampaMenu();
    }

}
