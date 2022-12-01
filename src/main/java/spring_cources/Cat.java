package spring_cources;

import org.springframework.stereotype.Component;

//@Component ("catBean")
public class Cat implements Pet{

    public Cat() {
        System.out.println("Bean Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Meuw-meuw");
    }
}
