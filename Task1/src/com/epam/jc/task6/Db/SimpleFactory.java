package com.epam.jc.task6.Db;

import com.epam.jc.task6.Db.DAO.RecordsDAO;

/**
 * @author endiny
 */
public class SimpleFactory {
    private static RecordsDAO recordsDAO = null;
    private static SimpleFactory instance = null;

    public synchronized static SimpleFactory getInstance() {
        return (instance==null)?(instance = new SimpleFactory()):instance;
    }

    public RecordsDAO getRecordsDAO() {
        return (recordsDAO==null)?(recordsDAO = new RecordsDAO()):recordsDAO;
    }

}
