package com.camsoft.smartpos.model;

import javax.persistence.*;

/**
 * @author: chhai.chivon on 6/14/2018.
 */
@Entity
@Table(name = "TS_FUNCTION_GROUP")
public class FunctionGroup extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FUNCTION_GROUP_ID")
    private int functionGroupId;

    private String iconFile;

}
