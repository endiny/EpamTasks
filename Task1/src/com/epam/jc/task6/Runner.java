package com.epam.jc.task6;

import com.epam.jc.task6.Db.DAO.RecordsDAO;
import com.epam.jc.task6.Db.Entities.Records;
import com.epam.jc.task6.Db.SimpleFactory;

import java.sql.SQLException;
/**
 * @author endiny
 */

public class Runner {
    public static void main(String[] args) throws SQLException {
        RecordsDAO instance = SimpleFactory.getInstance().getRecordsDAO();
        instance.addRecord(new Records("62"));
        instance.addRecord(new Records("61"));
        instance.addRecord(new Records("63"));
        instance.addRecord(new Records("56"));
        instance.addRecord(new Records("66"));
//        System.out.println(tmp.toString());
        Records tmp = SimpleFactory.getInstance().getRecordsDAO().getRecordById((long)4);
        tmp.setValue("Kokoko");
        instance.addRecord(new Records("442"));
        instance.updateRecord(tmp);
        instance.deleteRecord(SimpleFactory.getInstance().getRecordsDAO().getRecordById((long)2));
        for (Object i:instance.getAllRecords()) {
            System.out.println(((Records)i).toString());
        }
    }
}
