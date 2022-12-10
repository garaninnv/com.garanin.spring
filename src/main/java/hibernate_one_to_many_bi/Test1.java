package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department department = new Department("Sales", 1500, 500);
//            Employee emp1 = new Employee("Evgen", "Petrov", 1000);
//            Employee emp2 = new Employee("Vadim", "Sidorov", 800);
//            Employee emp3 = new Employee("Semen", "Garanin", 800);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//*****************************************************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();
            System.out.println("Get department");
            Department department = session.get(Department.class,3);
            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Подгружаем работников");
            department.getEmps().get(0);

            session.getTransaction().commit();
            System.out.println("Show employee of department");
            System.out.println(department.getEmps());
            System.out.println("Done!");
//*****************************************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class,1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//*****************************************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class,1);
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
        }
        finally {
//            session.close();
            factory.close();
        }

    }
}
