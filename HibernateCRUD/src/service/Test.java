package service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		System.out.println("connecting to database");
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		System.out.println("created");
			
	}

}
