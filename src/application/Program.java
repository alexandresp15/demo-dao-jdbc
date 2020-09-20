package application;

import java.util.Date;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Department department = new Department(1, "Book");

		System.out.println(department);
		
		Seller seller = new Seller(21, "Paulo", "paulo@gmail.com", new Date(), 3000.0, department);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
		

	}

}
