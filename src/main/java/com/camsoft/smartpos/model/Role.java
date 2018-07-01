package com.camsoft.smartpos.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @aouth chhaichivon on 7/1/2018
 */
@Data
@Entity
@Table(name = "TU_ROLE")
public class Role extends AbstractModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROLE_ID")
    private int roleId;


}
