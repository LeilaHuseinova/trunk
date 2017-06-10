import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author leyla
 * @since 17.05.17
 */
@SpringBootApplication
@ComponentScan({"com"})
@EntityScan({"com"})
public class ControllerConfig {

    public static void main(String[] args) {
        SpringApplication.run(ControllerConfig.class, args);
    }
}
