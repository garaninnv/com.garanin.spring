package spring_cources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component ("personBean")
//@Scope("prototype")
public class Person {

    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;


    public Person(Pet pet) {
        this.pet = pet;
    }

//    public Person() {
//        System.out.println("Person bean is created");
//    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet Autowired");
        this.pet = pet;
    }

    public void callYourPet () {
        System.out.println("Hello");
        pet.say();
    }
}
