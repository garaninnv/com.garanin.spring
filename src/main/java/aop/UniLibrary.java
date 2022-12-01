package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrery {

    public void getBook () {
        System.out.println("Мы взяли книгу из UniLibrary");
        System.out.println("---------------------------------------------");
    }

    public String returnBook () {
        int i = 10/0;
        System.out.println("Возвращаем книгу в UniLibrary");
        return "Война и Мир";
    }

    public void getMagazine () {
        System.out.println("Мы взяли журнал из UniLibrary");
        System.out.println("---------------------------------------------");
    }

    public void returnMagazin () {
        System.out.println("Возвращаем журнал в UniLibrary");
        System.out.println("---------------------------------------------");
    }

    public void addBook (String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("---------------------------------------------");
    }

    public void addMagazin () {
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("---------------------------------------------");
    }
}
