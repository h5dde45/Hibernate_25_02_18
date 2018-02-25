package ru.hibernate.main;

import org.hibernate.Session;
import ru.hibernate.dao.ContactEntity;
import ru.hibernate.utils.HibernateSessionFactory;

public class AppMain {
    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        ContactEntity contactEntity = new ContactEntity();

        contactEntity.setBirthDate(new java.util.Date());
        contactEntity.setFirstName("Nick");
        contactEntity.setLastName("VN");

        session.save(contactEntity);
        session.getTransaction().commit();

        HibernateSessionFactory.shutdown();


    }
}
