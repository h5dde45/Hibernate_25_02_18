package ru.hibernate.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.hibernate.utils.HibernateSessionFactory;

public class AppMain {
    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

//        ContactEntity contactEntity = new ContactEntity();
//
//        contactEntity.setBirthDate(new java.util.Date());
//        contactEntity.setFirstName("Nick");
//        contactEntity.setLastName("VN");
//
//        session.save(contactEntity);
//        session.getTransaction().commit();

//        Query query = session.createQuery("from ContactEntity where firstName = :paramName");
//        query.setParameter("paramName", "Nick");
//        List list = query.list();
//        System.out.println(list);

//        Query query = session.createQuery("update ContactEntity " +
//                "set firstName = :nameParam, lastName = :lastNameParam" +
//                ", birthDate = :birthDateParam"+
//                " where firstName = :nameCode");
//
//        query.setParameter("nameCode", "Nick");
//        query.setParameter("nameParam", "NickChangedName1");
//        query.setParameter("lastNameParam", "LastNameChanged1" );
//        query.setParameter("birthDateParam", new Date());
//
//        int result = query.executeUpdate();
//        transaction.commit();
//        System.out.println(result);
//        Calendar startDate=new GregorianCalendar(1999,2,22);
//        Calendar endDate=new GregorianCalendar(2017,2,22);
//        System.out.println(getNameCriteria(startDate,endDate,session));

        HibernateSessionFactory.shutdown();


    }
//    private static List getNameCriteria(Calendar startDate, Calendar endDate, Session session) {
//        Criteria criteria = session.createCriteria(ContactEntity.class);
//
//        if(startDate != null) {
//            criteria.add(Restrictions.ge("birthDate", startDate.getTime()));
//            /*@DEPRECATED
//            criteria.add(Expression.ge("birth_date", startDate.getTime()));
//            */
//        }
//        if(endDate != null) {
//            criteria.add(Restrictions.le("birthDate", endDate.getTime()));
//        }
//        criteria.addOrder(Order.desc("birthDate"));
//        return criteria.list();
//    }
}
