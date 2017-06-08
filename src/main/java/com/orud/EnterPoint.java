package com.orud;

import com.orud.entity.User;
import com.orud.persistence.HibernateUtil;
import org.hibernate.Session;
/**
 * Created by Alex on 03.06.2017.
 */
public class EnterPoint {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName("Danny");
        user.setLastName("Rand");

        session.save(user);
        session.getTransaction().commit();
    }

}
