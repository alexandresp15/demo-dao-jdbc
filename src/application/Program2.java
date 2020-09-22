package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartamentDao();
		
		System.out.println("==== TEST 1: department findById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		
		System.out.println("\n==== TEST 2: department findByAll ====");
		List<Department> list = departmentDao.findAll();

		for (Department dep : list) {
			System.out.println(dep);
		} 
		
		System.out.println("\n==== TEST 4: department insert ==== ");
		Department newDepartment = new Department(null, "Fashion");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n==== TEST 5: department update==== ");
		department = departmentDao.findById(3);
		department.setName("Movie");
		departmentDao.update(department);
		System.out.println("Update completed"); 
		
		
		
		System.out.println("\n==== TEST 6: department delete ==== ");
		System.out.print("Enter id for delete test: ");
		int id = input.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		input.close(); 
	} 
}
