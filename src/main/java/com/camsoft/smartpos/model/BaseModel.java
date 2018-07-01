package com.camsoft.smartpos.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: chhai.chivon on 6/28/2018.
 */
@Data
public abstract class BaseModel implements Serializable{

    public int createdBy;
    public String createdDate;
    public int updatedBy;
    public String updatedDate;
    public boolean status;

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
