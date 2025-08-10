package com.hibernet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {
    public static void main(String[] args) {
//  Student s1 = new Student();
//     s1.setsName("hvbfaoduhao");
//     s1.setRollNo(120);
//     s1.setSage(25);
//
//
//
//
//
//
//
//     SessionFactory sf = new Configuration()
//             .addAnnotatedClass(com.hibernet.Student.class)
//             .configure()
//             .buildSessionFactory();
//      cfg.buildSessionFactory();
//     Session session = sf.openSession();
//
//     Transaction transaction = session.beginTransaction();
//
//     s1 = session.get(Student.class,120);
//
//     session.remove(s1);
//
//     transaction.commit();
//
//
//     Transaction transaction = session.beginTransaction();
//     session.persist(s1);
//     transaction.commit();
//     session.close();
//     sf.close();
//   System.out.println(s1);

     Laptop l1 = new Laptop();
     l1.setLid(1);
     l1.setBrand("MSI");
     l1.setModel("RTX200");
     l1.setRam(16);

     Alien a1 = new Alien();
     a1.setAid(101);
     a1.setAname("jaideep");
     a1.setTech("python");
     a1.setLaptop(l1);

     SessionFactory sf = new Configuration().addAnnotatedClass(com.hibernet.Alien.class)
             .addAnnotatedClass(com.hibernet.Laptop.class).configure().buildSessionFactory();

     Session session = sf.openSession();

     Transaction transaction = session.beginTransaction();
     session.persist(l1);
     session.persist(a1);


     transaction.commit();


     session.close();
     sf.close();


    }
}