package com.dao;

import java.util.List;



import com.bean.Employee;
import com.customtemplate.Customtemplate;

public  class Daoimpl implements Dao {

private Customtemplate custom;

	public void setCustom(Customtemplate custom) {
	this.custom = custom;
}

	public int save(Employee employee) {
		String insert="insert into employee values(?,?,?)";
		Object[] params= {employee.getId(),employee.getName(),employee.getSalary()};
		int result=custom.customupdate(insert, params);
		return result;
	}

	public int update(Employee employee) {
		String update="update employee set name=?,salary=? where id=?";
		return custom.customupdate(update, new Object[] {employee.getName(),employee.getSalary(),employee.getId()});
		
		
	}

	
	public List<Employee> getAll() {
		return null;
	}

	public void delete(int id) {
	
		
	}

	

}
