package sampleDepartment.Department.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sampleDepartment.Department.Entity.Department;
import sampleDepartment.Department.Repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
     @Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}
     
}
