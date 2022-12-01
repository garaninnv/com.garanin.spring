package spring_cources;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("spring_cources")
public class MyConfig {

    @Bean
    public Person personBean () {
        return new Person(catBean());
    }

    @Bean
    @Scope("singleton")
    public Pet catBean () {
        return new Cat();
    }


}
