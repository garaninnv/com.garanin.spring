package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Nikolai", book);
        uniLibrary.addMagazin();

//        uniLibrary.returnBook();
//
//        ScoolLabrery scoolLabrery = context.getBean("scoolLabrery", ScoolLabrery.class);
//        scoolLabrery.getBook();

        context.close();

    }
}
