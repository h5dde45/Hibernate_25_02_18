package ru.hibernate.dao;

import ru.hibernate.entity.ContactEntity;

import java.util.List;

public interface ContactDao {
    // Найти все контакты.
     List findAll();

    // Найти все контакты с заданным телефоном и хобби.
     List<ContactEntity> findAllWithDetail();

    // Найти контакт со всеми деталями по идентификатору.
     ContactEntity findById(Long id);

    // Вставить или обновить контакт.
     ContactEntity save(ContactEntity contact);

    // Удалить контакт.
     void delete(ContactEntity contact);
}
