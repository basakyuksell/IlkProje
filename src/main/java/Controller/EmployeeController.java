package Controller;

import Dto.EmployeeDto;
import Model.Employee;
import Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
public class EmployeeController {

    EmployeeService employeeService;

    @RequestMapping(value = "/list")
    public List<Employee> getList()
    {
        return employeeService.findAll();
    }

    @RequestMapping(value={"/personEdit","/personEdit/{id}"}, method = RequestMethod.GET)
    public String personEditForm(Employee employee, @PathVariable(required = false, name = "id") Long id) {
        if (null!=id) {
            employee.addAttribute("employee", employeeService.findOne(id));
        } else {
            employee.addAttribute("employee", new Employee());
        }
        return "employee";
    }

    @RequestMapping(value="/personEdit", method = RequestMethod.POST)
    public String personEdit(Employee employee) {
        employeeService.saveEmployee(employee);
        employee.addAttribute("employeeList", employeeService.findAll());
        return "employeeList";
    }
    @RequestMapping(value="/personDelete/{id}", method = RequestMethod.GET)
    public String personDelete(Employee employee, @PathVariable(required = true, name = "id") Long id) {
        employeeService.deleteEmployee(id);
        employee.addAttribute("employeeList", employeeService.findAll());
        return "employeeList";
    }


    /*
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/list")
    public String employeeList(Model model)
    {
        model.addAttribute("employeeList", employeeService.save());
        return "employeeList";
    }

*/







}
