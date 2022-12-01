package spring_cources;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is create");
    }

//    @PostConstruct
//    public void init () {
//        System.out.println("Class Dog init metod");
//    }
//    @PreDestroy
//    public  void destroy () {
//        System.out.println("Class Dog destroy metod");
//    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
