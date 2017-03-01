package com.company.cqcwb.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "CQCWB_CUSTOMER")
@Entity(name = "cqcwb$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 5671270784377683290L;

    @Column(name = "NAME")
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}