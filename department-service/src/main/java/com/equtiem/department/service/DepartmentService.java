package com.equtiem.department.service;

import com.equtiem.department.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department findById(long id);
}
