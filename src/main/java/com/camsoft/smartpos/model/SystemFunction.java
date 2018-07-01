package com.camsoft.smartpos.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: chhai.chivon on 6/14/2018.
 */
@Setter
@Getter
@Data
@Entity
@Table(name = "TS_SYSTEM_FUNCTION")
public class SystemFunction extends AbstractModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SYSTEM_FUNCTION_ID")
    private String funcId;
    private String funcGroup;
    private String funcDesc;
    private String iconFile;

    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public String getFuncGroup() {
        return funcGroup;
    }

    public void setFuncGroup(String funcGroup) {
        this.funcGroup = funcGroup;
    }

    public String getFuncDesc() {
        return funcDesc;
    }

    public void setFuncDesc(String funcDesc) {
        this.funcDesc = funcDesc;
    }

    public String getIconFile() {
        return iconFile;
    }

    public void setIconFile(String iconFile) {
        this.iconFile = iconFile;
    }
}
