package com.epam.jc.task6;

import com.epam.jc.task6.Db.DAO.RecordsDAO;
import com.epam.jc.task6.Db.Entities.Records;
import com.epam.jc.task6.Db.SimpleFactory;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author endiny
 */
public class DbTest {

    @Test
    public void testName() throws Exception {
        RecordsDAO instance = SimpleFactory.getInstance().getRecordsDAO();
        assertNotNull(instance);
        instance.addRecord(new Records("62"));
        instance.addRecord(new Records("61"));
        instance.addRecord(new Records("63"));
        instance.addRecord(new Records("56"));
        instance.addRecord(new Records("66"));
        Records tmp = SimpleFactory.getInstance().getRecordsDAO().getRecordById((long)4);
        System.out.println(tmp.toString());
        tmp.setValue("Kokoko");
        instance.addRecord(new Records("442"));
        instance.updateRecord(tmp);
        instance.deleteRecord(SimpleFactory.getInstance().getRecordsDAO().getRecordById((long)2));
        for (Object i:instance.getAllRecords()) {
            System.out.println(((Records)i).toString());
        }
    }
}