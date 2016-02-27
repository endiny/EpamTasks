package com.epam.jc.task6.Db.DAO;

import com.epam.jc.task6.Db.DbController;
import com.epam.jc.task6.Db.Entities.Users;
import com.sun.istack.internal.Nullable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author endiny
 */
public class UsersDAO {

    public void addRecord(Users o) throws SQLException {
            Session session = null;
        try {
            session = DbController.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session!=null && session.isOpen()) {
                session.close();
            }
        }
    }

    public void updateRecord(Object o) throws SQLException {
        Session session = null;
        try {
            session = DbController.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(o);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Nullable
    public Users getRecordById(Long id) throws SQLException {
        Users o = null;
        Session session = null;
        try {
            session = DbController.getSessionFactory().openSession();
            o = (Users)session.load(Users.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return o;
    }

    public List getAllRecords() throws SQLException {
        Session session = null;
        List<Users> o = new ArrayList<Users>();
        try {
            session = DbController.getSessionFactory().openSession();
            o = session.createCriteria(Users.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return o;
    }

    public void deleteRecord(Users o) throws SQLException {
        Session session = null;
        try {
            session = DbController.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(o);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
