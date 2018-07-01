package com.camsoft.smartpos.model;

import lombok.Data;

/**
 * @aouth chhaichivon on 7/1/2018
 */
@Data
public abstract class AbstractModel extends BaseModel{

    public String name;
    private String nameEn;
    private String des;
    private String desEn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getDesEn() {
        return desEn;
    }

    public void setDesEn(String desEn) {
        this.desEn = desEn;
    }
}
