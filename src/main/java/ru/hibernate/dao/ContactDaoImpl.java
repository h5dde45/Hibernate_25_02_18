package ru.hibernate.dao;

import org.hibernate.Session;
import ru.hibernate.entity.ContactEntity;

import java.util.List;

public class ContactDaoImpl implements ContactDao {

    private Session session;

    public void setSession(Session session) {
        this.session = session;
    }

    public Session getSession() {
        return session;
    }

    @Override
    public List<ContactEntity> findAll() {
        return session.createQuery("from ContactEntity c").list();
    }

    @Override
    public List<ContactEntity> findAllWithDetail() {
        return null;
    }

    @Override
    public ContactEntity findById(Long id) {
        return null;
    }

    @Override
    public ContactEntity save(ContactEntity contact) {
        return null;
    }

    @Override
    public void delete(ContactEntity contact) {

    }
}
