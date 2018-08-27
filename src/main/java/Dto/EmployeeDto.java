package Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class EmployeeDto {
    private String name;
    private String surname;
    private String phone;
    private String university;
    private String universityDept;
    private List<GroupDto> groups = new ArrayList<>();

}
