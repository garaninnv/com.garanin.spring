package hibernate_one_to_many_bi.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String deparmentName;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "min_salary")
    private  int minSalary;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department", fetch = FetchType.LAZY)
//    @JoinColumn(name = "id")
    private List<Employee> emps;

    public Department() {
    }

    public Department(String deparmentName, int maxSalary, int minSalary) {
        this.deparmentName = deparmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmployeeToDepartment(Employee employee) {
        if(emps == null) {
            emps = new ArrayList<>();
        }
        emps.add(employee);
        employee.setDepartment(this);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deparmentName='" + deparmentName + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }
}
