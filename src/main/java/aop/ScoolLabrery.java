package aop;

import org.springframework.stereotype.Component;

@Component
public class ScoolLabrery extends AbstractLibrery {

    public void getBook() {
        System.out.println("Мы взяли книгу из ScoolLabrery");
    }
}
