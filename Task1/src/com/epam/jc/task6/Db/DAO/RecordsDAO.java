package com.epam.jc.task6.Db.DAO;

import com.epam.jc.task6.Db.DbController;
import com.epam.jc.task6.Db.Entities.Records;
import com.sun.istack.internal.Nullable;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author endiny
 */
public class RecordsDAO {
    public void addRecord(Records o) throws SQLException {
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

    public void updateRecord(Records o) throws SQLException {
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
    public Records getRecordById(Long id) throws SQLException {
        Records o = null;
        Session session = null;
        try {
            session = DbController.getSessionFactory().openSession();
            o = (Records)session.load(Records.class, id);
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
        List o = new ArrayList<Records>();
        try {
            session = DbController.getSessionFactory().openSession();
            o = session.createCriteria(Records.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return o;
    }

    public void deleteRecord(Records o) throws SQLException {
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
