package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("English");
//
//            Child child1 = new Child("Yulya", 5);
//            Child child2 = new Child("Nady", 7);
//            Child child3 = new Child("Vika", 8);
//            section1.AddChildToSection(child1);
//            section1.AddChildToSection(child2);
//            section1.AddChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
            //****************************************************

//            session = factory.getCurrentSession();
//
//            Child child1 = new Child("Oksana", 6);
//            Section section1 = new Section("Dance");
//            Section section2 = new Section("Makrame");
//            Section section3 = new Section("Teatr");
//
//            child1.AddSectionToChild(section1);
//            child1.AddSectionToChild(section2);
//            child1.AddSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
            //****************************************************

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 2);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
            //****************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 6);
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//**************************************************
            session = factory.getCurrentSession();
            session.beginTransaction();

            Child child = session.get(Child.class, 7);
            session.delete(child);

            session.getTransaction().commit();
            System.out.println("Done!");

        }
        finally {
            session.close();
            factory.close();
        }
    }

}
