package com.molodyko.spring_boot_rest_2.DAO;

import com.molodyko.spring_boot_rest_2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee,Integer> {
}
