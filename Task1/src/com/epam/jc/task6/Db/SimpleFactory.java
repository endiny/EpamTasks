package com.epam.jc.task6.Db;

import com.epam.jc.task6.Db.DAO.RecordsDAO;
import com.epam.jc.task6.Db.DAO.UsersDAO;

/**
 * @author endiny
 */
public class SimpleFactory {
    private static RecordsDAO recordsDAO = null;
    private static UsersDAO usersDAO = null;
    private static SimpleFactory instance = null;

    public synchronized static SimpleFactory getInstance() {
        return (instance==null)?(instance = new SimpleFactory()):instance;
    }

    public static RecordsDAO getRecordsDAO() {
        return (recordsDAO==null)?(recordsDAO = new RecordsDAO()):recordsDAO;
    }

    public static UsersDAO getUsersDAO() {
        return (usersDAO==null)?(usersDAO = new UsersDAO()):usersDAO;
    }
}
