package spring_cources;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.DecimalFormat;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat1 = context.getBean("catBean", Pet.class);
        Pet cat2 = context.getBean("catBean", Pet.class);
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        System.out.println(cat1);
        System.out.println(cat2);
        cat1.say();

        context.close();
    }
}
