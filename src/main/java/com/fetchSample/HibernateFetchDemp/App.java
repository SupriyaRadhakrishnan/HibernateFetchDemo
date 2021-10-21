package com.fetchSample.HibernateFetchDemp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//    	Alien alien = new Alien();
//    	alien.setAid(1);
//    	alien.setAname("Sam");
//    	Alien alien1 = new Alien();
//    	alien1.setAid(2);
//    	alien1.setAname("John");
//    	Alien alien2 = new Alien();
//    	alien2.setAid(3);
//    	alien2.setAname("Greg");
//    	
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(101);
//    	laptop.setLname("Dell");
//    	laptop.setAlien(alien);
//    	
//    	Laptop laptop1 = new Laptop();
//    	laptop1.setLid(102);
//    	laptop1.setLname("Dell");
//    	laptop1.setAlien(alien1);
//    	
//    	Laptop laptop2 = new Laptop();
//    	laptop2.setLid(103);
//    	laptop2.setLname("HP");
//    	laptop2.setAlien(alien);
//    	
//    	
//    	Laptop laptop3 = new Laptop();
//    	laptop3.setLid(104);
//    	laptop3.setLname("Dell");
//    	laptop3.setAlien(alien2);
//    	
//    	
//    	Laptop laptop4 = new Laptop();
//    	laptop4.setLid(105);
//    	laptop4.setLname("Mac");
//    	laptop4.setAlien(alien);
//    	
    	
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
    	SessionFactory sf = cfg.buildSessionFactory(reg);
    	Session s = sf.openSession();
    	s.beginTransaction();
//    	s.save(alien);
//    	s.save(alien1);
//    	s.save(alien2);
//    	s.save(laptop);
//    	s.save(laptop1);
//    	s.save(laptop2);
//    	s.save(laptop3);
//    	s.save(laptop4);
    	
    	Alien a = (Alien) s.get(Alien.class,1);
//    	System.out.println(a.getAname());
//    	List<Laptop> laps = a.getLaps();
//
//    	for(Laptop l :laps)
//    	{
//    		System.out.println(l);
//    	}
    	s.getTransaction().commit();
    	
    }
}
