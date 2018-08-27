package Service;

import Model.Employee;
import Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp  implements EmployeeService{

@Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findOne(Long id) {
        return employeeRepository.getOne(id);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
      employeeRepository.deleteById(id);
    }

/*


    @Autowired
    PersonRepository personRepository;


    @Override
    public List<Person> findAll() {

        return personRepository.findAll();
    }

    @Override
    public Person findOne(int id) {

        return personRepository.getOne(id);
    }

    @Override
    public Person savePerson(Person person) {
        // TODO Auto-generated method stub
        return  personRepository.save(person);
    }

    @Override
    public void deletePerson(int id) {
        // TODO Auto-generated method stub
        personRepository.deleteById(id);

    }
*/
}
