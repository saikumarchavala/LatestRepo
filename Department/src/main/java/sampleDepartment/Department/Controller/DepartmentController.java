package sampleDepartment.Department.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sampleDepartment.Department.Entity.Department;
import sampleDepartment.Department.Service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	@PostMapping( value="/departments",consumes= "{application/json}",produces="{application/json}")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartment(department);
		
	}

	
	
	
	
}
