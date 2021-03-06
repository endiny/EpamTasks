package com.epam.jc.task6.Db.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Entity-class for keeping records
 * @author endiny
 */

@Entity
public class Records implements Serializable {
    public Records(String value) {
        this.value = value;
    }

    public Records() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;

    public Long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Records{");
        sb.append("id=").append(id);
        sb.append(", value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setId(Long id) {
        this.id = id;
    }
}
