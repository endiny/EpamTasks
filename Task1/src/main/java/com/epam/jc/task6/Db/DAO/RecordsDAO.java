package com.epam.jc.task6.Db.DAO;

import com.epam.jc.task6.Db.DbController;
import com.epam.jc.task6.Db.Entities.Records;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that provides an abstraction for management of DB objects
 * @author endiny
 */
public class RecordsDAO {
    /**
     * Add Notepad record to database.
     * @param o Notepad record object
     * @throws SQLException
     */
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

    /**
     * Edit record. Object must contain valid id.
     * @param o An edited object
     * @throws SQLException
     */
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

    /**
     * Get a record by id
     * @param id id of the record
     * @return record by specified id
     * @throws SQLException
     */
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

    /**
     * Get all records in the table
     * @return list of records
     * @throws SQLException
     */
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

    /**
     * Remove a record by object.
     * @param o object to remove
     * @throws SQLException
     */
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
