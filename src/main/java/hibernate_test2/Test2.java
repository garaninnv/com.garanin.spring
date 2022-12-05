package hibernate_test2;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Employee emp = new Employee("Ivan","Ivanov", "Sales", 850);
//            Detail detail = new Detail("Atyrau", "654654654", "avanov@bk.ru");
//            emp.setEmpDetail(detail);
//            detail.setEmployee(emp);

//            session.beginTransaction();
////            session.save(emp);
//            Detail detail = session.get(Detail.class, 1);
//            System.out.println(detail.getEmployee());


            session.beginTransaction();
            Detail detail = session.get(Detail.class, 3);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
//            session.close();
            factory.close();
        }

    }
}
