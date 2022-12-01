package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Война и мир")
    private String nameBook;

    @Value("Л.Н.Толстой")
    private String autor;

    @Value("1812")
    private int yearOfPublication;

    public String getNameBook() {
        return nameBook;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
