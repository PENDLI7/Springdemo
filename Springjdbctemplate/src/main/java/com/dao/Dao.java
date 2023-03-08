package com.dao;

import java.util.List;

import com.bean.Employee;

public interface Dao {
 int save(Employee employee);
 int update(Employee employee);
 void delete(int id);
 List<Employee>getAll();
	

}
