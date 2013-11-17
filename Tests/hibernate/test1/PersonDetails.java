package test1;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class PersonDetails
{
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	public static void setUP()
	{
		try
		{
			Configuration cfg = new Configuration().addResource(
			"person.hbm.xml").configure();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(
			cfg.getProperties()).buildServiceRegistry();
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		}catch (Throwable ex)
		{
			System.err.println("Failed to create sessionFactory object."+ ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static void insertPerson(Person person){
		Session session = sessionFactory.openSession();
		System.out.println("Inserting Record");

		session.save(person);
		session.beginTransaction().commit();
		
		System.out.println("Done");
		session.close();
	}
	
	public static void savePerson(Person person){
		Session session = sessionFactory.openSession();
		System.out.println("Inserting Record");

		session.save(person);
		session.beginTransaction().commit();
		
		System.out.println("Done");
		session.close();
	}
	
	
	public static void loadPersons(){
		Session session = sessionFactory.openSession();
		List<?> employees = session.createQuery("FROM Person").list();
		for (Iterator<?> iterator = employees.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println("Person ID: " + person.getId());
			System.out.println("Person Name: " + person.getName());
			System.out.println("----------------------------------------");
		}
	}
	
	public static void loadAccounts(){
		Session session = sessionFactory.openSession();
		List<?> employees = session.createQuery("FROM Account").list();
		for (Iterator<?> iterator = employees.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println("Person ID: " + person.getId());
			System.out.println("Person Name: " + person.getName());
			System.out.println("----------------------------------------");
		}
	}
	
	
}