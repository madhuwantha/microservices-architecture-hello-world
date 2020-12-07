package com.equtiem.department.service.impl;

import com.equtiem.department.entity.Department;
import com.equtiem.department.repository.DepartmentRepository;
import com.equtiem.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department findById(long id) {
        return departmentRepository.findById(id).get();
    }
}
