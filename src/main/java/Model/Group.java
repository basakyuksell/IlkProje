package Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "group")
public class Group {
    private Long id;
    private String groupName;

    @ManyToOne
    @JoinColumn(name ="department_id")
    private Department department;

    @ManyToMany
    @JoinColumn(name ="employee_id")
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
