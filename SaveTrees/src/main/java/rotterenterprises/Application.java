package rotterenterprises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import rotterenterprises.dao.TreeRepository;
import rotterenterprises.models.Tree;

import javax.sql.DataSource;
import java.util.Arrays;

@SpringBootApplication
@EnableJpaRepositories("rotterenterprises.dao")
@EntityScan("rotterenterprises.models")
public class Application implements CommandLineRunner{

    @Autowired
    DataSource dataSource;

    @Autowired
    TreeRepository treeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let´s inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Our DataSource is = " + dataSource);
        Iterable<Tree> systemlist = treeRepository.findAll();
        for(Tree systemmodel:systemlist){
            System.out.println("Here is a treesystem: " + systemmodel.toString());
        }
    }
}
