package Service;

import Model.Department;
import Model.Employee;
import Model.Group;
import Repository.DepartmentRepository;
import Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findOne(Long id);

    Employee saveEmployee(Employee notes);

    void deleteEmployee(Long id);

    /*
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;
    public List<Employee> listOwners() {
        return employeeRepository.findAll();
    }

    public interface save() {


        Department department = new Department();
        department.setName("Uygulama Geliştirme");
        departmentRepository.save(department);

        Group group = new Group();
        group.setGroupName("misyon");
        group.setDepartment(department);

        Employee employee = new Employee();
        employee.setPhone("5750");
        employee.setUniversity("Yalova Üniversitesi");
        employee.setName("başak");
        employee.setSurname("yüksel");
        employee.setUniversityDept("Bilgisayar Mühendisliği");
        employee.getGroup().add(group);
        group.setEmployee(employee);

        return employeeRepository.save(employee);
    }
    public void delete(Long id) {
        // TODO Auto-generated method stub
        employeeRepository.deleteById(id);

    }
    public Employee findOne(Long id) {

        return employeeRepository.getOne(id);
    }
*/

}
