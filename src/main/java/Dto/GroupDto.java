package Dto;

import Model.Department;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupDto {
    private Long id;
    private String groupName;
    private Department department;
}
