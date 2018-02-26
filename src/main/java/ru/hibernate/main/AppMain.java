package ru.hibernate.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.hibernate.dao.ContactDaoImpl;
import ru.hibernate.entity.ContactEntity;
import ru.hibernate.entity.ContactTelDetailEntity;
import ru.hibernate.utils.HibernateSessionFactory;

import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        ContactDaoImpl contactDAO = new ContactDaoImpl();
        contactDAO.setSession(session);

        Transaction tx = session.beginTransaction();

        List<ContactEntity> contacts = contactDAO.findAll();
        for (ContactEntity contact : contacts) {
            System.out.println(contact);
        }

        listContactsWithDetail(contacts);

        tx.commit();
        HibernateSessionFactory.shutdown();
    }
    private static void listContactsWithDetail(List<ContactEntity> contacts) {
        System.out.println("Contact with detail info");
        for (ContactEntity contact : contacts) {
            System.out.println(contact);
            if (contact.getContactTelDetails() != null) {
                for (ContactTelDetailEntity detailedContact : contact.getContactTelDetails()) {
                    System.out.println(detailedContact);
                }
            }
        }
    }
}
