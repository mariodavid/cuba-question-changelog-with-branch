package com.company.cqcwb.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CQCWB_CUSTOMER")
@Entity(name = "cqcwb$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 5671270784377683290L;

    @Column(name = "NAME", length = 4000)
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}