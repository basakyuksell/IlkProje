package Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee extends Person {
    private Long id;
    @Column(name = "phone")
    private String phone;
    @Column(name = "university")
    private String university;
    @Column(name = "universityDept")
    private String universityDept;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "employee")
    private List<Group> group = new ArrayList();

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getUniversityDept() {
        return universityDept;
    }

    public void setUniversityDept(String universityDept) {
        this.universityDept = universityDept;
    }

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }
}
